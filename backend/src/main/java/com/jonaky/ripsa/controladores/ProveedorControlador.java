package com.jonaky.ripsa.controladores;

import com.jonaky.ripsa.entidades.Proveedor;
import com.jonaky.ripsa.servicios.IProveedorServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

// http:/localhost:8080/ripsa -> contexto de app

@RequestMapping("ripsa")
@CrossOrigin(value = "http://localhost:3000")
public class ProveedorControlador {

    private static final Logger logger = LoggerFactory.getLogger(Proveedor.class);

    @Autowired
    private IProveedorServicio proveedorServicio;

    // listarproveedores
    @GetMapping("/proveedores")
    public List<Proveedor> obtenerProveedores(){
        var proveedores = proveedorServicio.listarProveedores();
        proveedores.forEach((proveedor) -> logger.info(proveedor.toString()));
        return proveedores;
    }

    @PostMapping("/proveedores")
    public Proveedor agregarProveedor(@RequestBody Proveedor proveedor){
        return proveedorServicio.guardarProveedor(proveedor);
    }


}
