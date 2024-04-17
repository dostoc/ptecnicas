package com.jonaky.ripsa.servicios;

import com.jonaky.ripsa.entidades.Producto;
import com.jonaky.ripsa.entidades.Proveedor;
import com.jonaky.ripsa.repocitorios.ProductoRepocitorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio {

    @Autowired
    ProductoRepocitorio productoRepocitorio;
    @Override
    public List<Producto> listarProductos() {
        return productoRepocitorio.findAll();
    }

    @Override
    public Producto buscarProducto(String idProducto) {
        return productoRepocitorio.findById(idProducto).orElse(null);
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepocitorio.save(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        productoRepocitorio.delete(producto);
    }

}
