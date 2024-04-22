package com.jonaky.ripsa.servicios;

import com.jonaky.ripsa.entidades.Persona;
import com.jonaky.ripsa.repocitorios.PersonaRepocitorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicio implements IPersonaServicio{

    @Autowired
    private PersonaRepocitorio personaRepocitorio;

    @Override
    public List<Persona> listarPersonas() {
        return personaRepocitorio.findAll();
    }

    @Override
    public Persona buscarPersonaPorId(Long id) {
        Persona persona = personaRepocitorio.findById(id).orElse(null);
        return persona;
    }

    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepocitorio.save(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaRepocitorio.delete(persona);
    }
}







