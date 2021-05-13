package br.com.testedev.apicrud.controllers;

import br.com.testedev.apicrud.model.entities.Fazer;
import br.com.testedev.apicrud.service.FazerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/fazer")
public class FazerController {

    @Autowired
    private FazerService service;

    @GetMapping(value = "/{id}")
public ResponseEntity<Fazer> findById(@PathVariable Integer id){
        Fazer obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/aberto")
    public ResponseEntity<List<Fazer>> listAbertas(){
        List<Fazer> list = service.findAllAbertas();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/fechadas")
    public ResponseEntity<List<Fazer>> listFechado(){
        List<Fazer> list = service.findAllFechadas();
        return ResponseEntity.ok().body(list);
    }

}
