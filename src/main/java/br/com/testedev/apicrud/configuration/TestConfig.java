package br.com.testedev.apicrud.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

//    @Autowired
//    private DBService dbService;
//
//    @Bean
//    public boolean instancia(){
//        this.dbService.instanciaBaseDados();
//        return true;
//    }

}
