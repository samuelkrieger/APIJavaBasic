package br.com.testedev.apicrud.controllers;

import br.com.testedev.apicrud.model.entities.Fazer;
import br.com.testedev.apicrud.service.FazerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/fazer")
public class FazerController {
    @Autowired
    private FazerService fazerService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Fazer> findById(@PathVariable Integer id) {
        Fazer obj = fazerService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/abertas")
    public ResponseEntity<List<Fazer>> listAbertas() {
        List<Fazer> list = fazerService.findAllAbertas();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/fechadas")
    public ResponseEntity<List<Fazer>> listFechado() {
        List<Fazer> list = fazerService.findAllFechadas();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping
    public ResponseEntity<List<Fazer>> listTodas() {
        List<Fazer> list = fazerService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Fazer> Criar(@RequestBody Fazer obj) {
        obj = fazerService.criarFazer(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleta(@PathVariable Integer id) {
        fazerService.deleteFazer(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Fazer> atualiza(@PathVariable Integer id, @RequestBody Fazer obj){
        Fazer newObj = fazerService.atualizaFazer(id,obj);
        return ResponseEntity.ok().body(newObj);
    }

}
