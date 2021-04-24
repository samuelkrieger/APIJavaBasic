package br.com.testedev.apicrud.controllers;

import br.com.testedev.apicrud.model.entities.Produto;
import br.com.testedev.apicrud.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto newProduto(String nome){


        Produto produto = new Produto(nome);

        produtoRepository.save(produto);

        return produto;
    }

}
