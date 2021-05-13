package br.com.testedev.apicrud.service;

import br.com.testedev.apicrud.model.entities.Fazer;
import br.com.testedev.apicrud.model.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;


    public void instanciaBaseDados() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Fazer t1 = new Fazer("Jogar", "Jogar League of Legends La tarde inteira",
                LocalDateTime.parse("13/05/2021 18:05", formatter));
        todoRepository.save(t1);

    }


}
