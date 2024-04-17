package com.jonaky.ripsa.servicios;

import com.jonaky.ripsa.entidades.Proveedor;
import com.jonaky.ripsa.repocitorios.ProductoRepocitorio;import com.jonaky.ripsa.repocitorios.ProveedorRepocitorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProveedorServicio implements IProveedorServicio{

    @Autowired
    private ProveedorRepocitorio proveedorRepocitorio;

    @Override
    public List<Proveedor> listarProveedores() {
        return proveedorRepocitorio.findAll();
    }

    @Override
    public Proveedor buscarProveedorPorId(Long idProveedor) {
        return proveedorRepocitorio.findById(idProveedor).orElse(null);
    }

    @Override
    public Proveedor guardarProveedor(Proveedor proveedor) {
        return proveedorRepocitorio.save(proveedor);
    }

    @Override
    public void eliminarProveedor(Proveedor proveedor) {
        proveedorRepocitorio.delete(proveedor);
    }
}
