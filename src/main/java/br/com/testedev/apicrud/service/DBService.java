package br.com.testedev.apicrud.service;

import br.com.testedev.apicrud.model.entities.Fazer;
import br.com.testedev.apicrud.model.repository.FazerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private FazerRepository fazerRepository;


    public void instanciaBaseDados() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Fazer t1 = new Fazer("Jogar", "Jogar League of Legends La tarde inteira",
                LocalDateTime.parse("13/05/2021 18:05", formatter),false);
        Fazer t2 = new Fazer("Estudar", "Java API Dale",
                LocalDateTime.parse("13/05/2022 18:05", formatter),true);
        Fazer t3 = new Fazer("Estudar", "Mais ainda um SQL brabo",
                LocalDateTime.parse("13/05/2023 18:05", formatter),true);
        Fazer t4 = new Fazer("Jogar", "Jogar mais um DontStarveZinhoDeLeve",
                LocalDateTime.parse("13/05/2024 18:05", formatter),false);

        fazerRepository.saveAll(Arrays.asList(t1,t2,t3,t4));

    }


}
