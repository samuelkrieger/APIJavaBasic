package br.com.testedev.apicrud.service;

import br.com.testedev.apicrud.model.entities.Fazer;
import br.com.testedev.apicrud.model.repository.FazerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private FazerRepository fazerRepository;


    public void instanciaBaseDados() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Fazer t1 = new Fazer("Primeiro exemplo", "Jogar League of Legends La tarde inteira",
                sdf.parse("13/05/2021"),false);
        Fazer t2 = new Fazer("Segun Exemplo", "Java API Dale",
                sdf.parse("13/05/2022"),true);
        Fazer t3 = new Fazer("Example Three", "Mais ainda um SQL brabo",
                sdf.parse("13/05/2023"),true);
        Fazer t4 = new Fazer("Exemplo Quatro", "Estudar HTML ate sonhar com paginas web",
                sdf.parse("13/05/2023"),true);

        fazerRepository.saveAll(Arrays.asList(t1,t2,t3,t4));

    }


}
