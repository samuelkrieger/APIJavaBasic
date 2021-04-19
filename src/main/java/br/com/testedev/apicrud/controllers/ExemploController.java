package br.com.testedev.apicrud.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class ExemploController{

    @GetMapping("/")
    public String find(){
        return "Voce acessou o metodo GET";
    }

//    @GetMapping("/")
//    public String findby(){
//        return "Voce acessou o metodo GET BY =";
//    }
    @PostMapping("/")
    public String post(){
        return "Voce acessou o metodo POST";
    }
    @PutMapping("/")
    public String put(){
        return "Voce acessou o metodo PUT";
    }

    @DeleteMapping("/")
    public String delete(){
        return "Voce acessou o metodo DELETE";
    }

}
