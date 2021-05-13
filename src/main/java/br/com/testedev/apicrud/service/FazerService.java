package br.com.testedev.apicrud.service;

import br.com.testedev.apicrud.model.entities.Fazer;
import br.com.testedev.apicrud.model.repository.FazerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FazerService {

    @Autowired
    private FazerRepository fazerRepository;

    public Fazer findById(Integer id){

        Optional<Fazer> obj = fazerRepository.findById(id);
        return obj.orElse(null);
    }


    public List<Fazer> findAllAbertas() {

        List<Fazer> list = fazerRepository.findAllAbertas();
        return list;
    }

    public List<Fazer> findAllFechadas() {

        List<Fazer> list = fazerRepository.findAllFechadas();
        return list;
    }


}



