package br.com.testedev.apicrud.service;

import br.com.testedev.apicrud.model.entities.Fazer;
import br.com.testedev.apicrud.model.repository.FazerRepository;
import br.com.testedev.apicrud.service.exceptions.ObjectNotFoundException;
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
        return obj.orElseThrow(()->new ObjectNotFoundException(
                "Objeto Nao Encontrado! Id: " +id+", Tipo : "+Fazer.class.getName()));
    }

    public List<Fazer> findAllAbertas() {

        List<Fazer> list = fazerRepository.findAllAbertas();
        return list;
    }

    public List<Fazer> findAllFechadas() {

        List<Fazer> list = fazerRepository.findAllFechadas();
        return list;
    }


    public List<Fazer> findAll() {
        List<Fazer> list = fazerRepository.findAll();
        return list;
    }

    public Fazer criarFazer(Fazer obj) {
        obj.setId(null);
        return fazerRepository.save(obj);

    }

    public void deleteFazer(Integer id) {
        fazerRepository.deleteById(id);
    }

}



