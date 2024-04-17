package com.jonaky.ripsa.controladores;

import com.jonaky.ripsa.entidades.Producto;
import com.jonaky.ripsa.servicios.IProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
// http://localhost:8080/ripsa/  contexto de la aplicacion
@RequestMapping("ripsa")
@CrossOrigin(value = "http://localhost:3000")
public class ProductoControlador {

    private final static Logger logger = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    IProductoServicio productoServicio;


    @GetMapping("/productos")
    public List<Producto> listarProductos(){
        var empleados = productoServicio.listarProductos();
        empleados.forEach((empleado -> logger.info(empleados.toString())));
        return empleados;
    }



    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto){
        return productoServicio.guardarProducto(producto);
    }


}
