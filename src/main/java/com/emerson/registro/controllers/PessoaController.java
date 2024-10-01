package com.emerson.registro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.emerson.registro.models.Pessoa;

@Controller // Controla o retorno de visualizações das views
public class PessoaController {

    @RequestMapping("/page")
    public String index() {
        return "index";
    }

    @RequestMapping("/pessoa")
    @ResponseBody
    public Pessoa Pessoa() {
        Pessoa p = new Pessoa(0, "Emerson J S Costa", "27/09/1985", "Masculino", "Loren Loren loren");
        return p;
    }

}
