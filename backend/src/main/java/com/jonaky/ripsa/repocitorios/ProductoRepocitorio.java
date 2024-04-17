package com.jonaky.ripsa.repocitorios;

import com.jonaky.ripsa.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepocitorio extends JpaRepository<Producto, String> {
}
