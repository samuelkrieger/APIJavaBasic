package br.com.testedev.apicrud.model.repository;

import br.com.testedev.apicrud.model.entities.Fazer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FazerRepository extends JpaRepository<Fazer,Integer> {

    @Query("SELECT obj FROM fazer obj WHERE obj.finalizado = 0 ORDER BY obj.dataParaFinalizar")
    List<Fazer> findAllAbertas();

    @Query("SELECT obj FROM fazer obj WHERE obj.finalizado = 1 ORDER BY obj.dataParaFinalizar")
    List<Fazer> findAllFechadas();

}
