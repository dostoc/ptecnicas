package com.jonaky.ripsa.servicios;

import com.jonaky.ripsa.entidades.Persona;

import java.util.List;

public interface IPersonaServicio {

    public List<Persona> listarPersonas();

    public Persona buscarPersonaPorId(Long id);

    public Persona guardarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
