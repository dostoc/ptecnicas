package com.jonaky.ripsa.servicios;

import com.jonaky.ripsa.entidades.Producto;

import java.util.List;

public interface IProductoServicio {
    //crud

    public List<Producto> listarProductos();

    public Producto buscarProducto(Long idProducto);

    public Producto guardarProducto(Producto producto);

    public void eliminarProducto(Producto producto);

}
