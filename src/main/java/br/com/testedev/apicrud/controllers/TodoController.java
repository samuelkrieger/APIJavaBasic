package br.com.testedev.apicrud.controllers;

import br.com.testedev.apicrud.model.entities.Fazer;
import br.com.testedev.apicrud.service.FazerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fazer")
public class TodoController {

    @Autowired
    private FazerService service;

    @GetMapping(value = "/{id}")
public ResponseEntity<Fazer> findById(@PathVariable Integer id){
        Fazer obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }




}
