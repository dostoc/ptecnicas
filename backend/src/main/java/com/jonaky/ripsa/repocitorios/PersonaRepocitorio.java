package com.jonaky.ripsa.repocitorios;

import com.jonaky.ripsa.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepocitorio  extends JpaRepository<Persona, Long> {
}
