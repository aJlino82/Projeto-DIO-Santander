package com.ajr.santander.controller;

import com.ajr.santander.model.JornadaTrabalho;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jornada")
public class JornadaController {
    @PostMapping
    public JornadaTrabalho createJornada() {
        return null;
    }
}
