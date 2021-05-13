package br.com.testedev.apicrud.service;

import br.com.testedev.apicrud.model.entities.Fazer;
import br.com.testedev.apicrud.model.repository.FazerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class FazerService {

    @Autowired
    private FazerRepository fazerRepository;

    public Fazer findById(Integer id){

        Optional<Fazer> obj = fazerRepository.findById(id);
        return obj.orElse(null);
    }


}
