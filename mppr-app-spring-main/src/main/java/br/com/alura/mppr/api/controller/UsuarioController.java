package br.com.alura.mppr.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UsuarioController {

    @RequestMapping("teste")
    public String teste() {
        return "Bem vindo a API";
    }
    
}
