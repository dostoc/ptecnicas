package com.jonaky.ripsa.repocitorios;

import com.jonaky.ripsa.entidades.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProveedorRepocitorio extends JpaRepository<Proveedor, Long> {

    }
