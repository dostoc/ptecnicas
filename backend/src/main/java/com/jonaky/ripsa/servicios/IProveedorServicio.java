package com.jonaky.ripsa.servicios;

import com.jonaky.ripsa.entidades.Proveedor;

import java.util.List;

public interface IProveedorServicio {
    //crud

    // listar / buscar / guardar / eliminar

    public List<Proveedor> listarProveedores();

    public Proveedor buscarProveedorPorId(Long idProveedor);

    public Proveedor guardarProveedor(Proveedor proveedor);

    public void eliminarProveedor(Proveedor proveedor);



}
