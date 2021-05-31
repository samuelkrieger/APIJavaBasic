package br.com.testedev.apicrud.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.testedev.apicrud.model.entities.Fazer;
import br.com.testedev.apicrud.service.FazerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "fazer")
@RequestMapping(value = "/fazer")
public class FazerController {
    @Autowired
    private FazerService fazerService;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(
            value = "encontrar por id",
            nickname = "encontrado",
            notes = "encontrar por id",
            response = ResponseEntity.class,
            tags = {"findById"}
    )
    @ApiResponses({
            @ApiResponse(code = 201, message = "fazer-encontrado", response = ResponseEntity.class),
            @ApiResponse(code = 400, message = "nao-encontrado"),
    })
    public ResponseEntity<Fazer> findById(@PathVariable Integer id) {
        Fazer obj = fazerService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/abertas")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(
            value = "encontrar todos abertos",
            nickname = "encontrados",
            notes = "encontrar todos abertos",
            response = ResponseEntity.class,
            tags = {"findAllAbertos"}
    )
    @ApiResponses({
            @ApiResponse(code = 201, message = "encontrados", response = ResponseEntity.class),
            @ApiResponse(code = 400, message = "nao-encontrados"),
    })
    public ResponseEntity<List<Fazer>> listAbertas() {
        List<Fazer> list = fazerService.findAllAbertas();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/fechadas")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(
            value = "encontrar todos fechados",
            nickname = "encontrados",
            notes = "encontrar todos fechados",
            response = ResponseEntity.class,
            tags = {"findAllFechadas"}
    )
    @ApiResponses({
            @ApiResponse(code = 201, message = "encontrados", response = ResponseEntity.class),
            @ApiResponse(code = 400, message = "nao-encontrados"),
    })
    public ResponseEntity<List<Fazer>> listFechado() {
        List<Fazer> list = fazerService.findAllFechadas();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(
            value = "encontrar todos ",
            nickname = "encontrados",
            notes = "encontrar todos ",
            response = ResponseEntity.class,
            tags = {"findAll"}
    )
    @ApiResponses({
            @ApiResponse(code = 201, message = "encontrados", response = ResponseEntity.class),
            @ApiResponse(code = 400, message = "nao-encontrados"),
         
    })
    public ResponseEntity<List<Fazer>> listTodas() {
        List<Fazer> list = fazerService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(
            value = "Criar",
            nickname = "Criar",
            notes = "Criar",
            response = ResponseEntity.class,
            tags = {"Creation"}
    )
    @ApiResponses({
            @ApiResponse(code = 201, message = "fazer-criada", response = ResponseEntity.class),
            @ApiResponse(code = 400, message = "fazer-erro"),
    })
    public ResponseEntity<Fazer> Criar(@RequestBody Fazer obj) {
        obj = fazerService.criarFazer(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(
            value = "Deletar Fazer",
            nickname = "delete",
            notes = "Deletar Fazer",
            response = ResponseEntity.class,
            tags = {"Deleta"}
    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "fazer-encontrado-deletado", response = ResponseEntity.class),
            @ApiResponse(code = 404, message = "fazer-not-found", response = ResponseEntity.class),
    })
    public ResponseEntity<Void> deleta(@PathVariable Integer id) {
        fazerService.deleteFazer(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(
            value = "Fazer Atualizado",
            nickname = "Atualizado",
            notes = "Fazer Atualizado",
            response = ResponseEntity.class,
            tags = {"Atualiza"}
    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "fazer-atualizado", response =  ResponseEntity.class),
            @ApiResponse(code = 400, message = "fazer-error"),
            @ApiResponse(code = 404, message = "fazer-not-found", response =  ResponseEntity.class),
    })
    public ResponseEntity<Fazer> atualiza(@PathVariable Integer id, @RequestBody Fazer obj){
        Fazer newObj = fazerService.atualizaFazer(id,obj);
        return ResponseEntity.ok().body(newObj);
    }

}
