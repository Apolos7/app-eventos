package com.ifs.edu.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.ifs.edu.eventoapp.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long> {
    
}
