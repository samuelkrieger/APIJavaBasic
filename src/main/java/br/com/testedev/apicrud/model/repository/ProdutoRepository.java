package br.com.testedev.apicrud.model.repository;

import br.com.testedev.apicrud.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository
        extends CrudRepository<Produto,Integer> {



}
