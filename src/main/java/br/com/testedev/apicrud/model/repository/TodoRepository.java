package br.com.testedev.apicrud.model.repository;

import br.com.testedev.apicrud.model.entities.Fazer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Fazer,Integer> {



}
