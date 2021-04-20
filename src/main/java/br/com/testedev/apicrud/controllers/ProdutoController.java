package br.com.testedev.apicrud.controllers;

import br.com.testedev.apicrud.model.entities.Produto;
import br.com.testedev.apicrud.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto newProduto(String nome){

        Produto produto = new Produto(nome);

        return produto;
    }

}
