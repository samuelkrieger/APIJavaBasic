package br.com.testedev.apicrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController{

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
