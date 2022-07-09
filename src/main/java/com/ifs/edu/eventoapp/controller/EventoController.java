package com.ifs.edu.eventoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ifs.edu.eventoapp.model.Evento;
import com.ifs.edu.eventoapp.repository.EventoRepository;

@Controller
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;
    
    @GetMapping("/cadastrarEvento")
    public String form() {
        return "formEvento";
    }

    @PostMapping("/cadastrarEvento")
    public String form(Evento evento) {

        eventoRepository.save(evento);

        return "redirect:/";
    }

    @GetMapping("/")
    public ModelAndView listaEventos() {
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<Evento> eventos = eventoRepository.findAll();

        modelAndView.addObject("eventos", eventos);
        return modelAndView;
    }

}
