package br.com.testedev.apicrud;

import br.com.testedev.apicrud.model.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApicrudApplication implements CommandLineRunner {

	@Autowired
	private TodoRepository todoRepository;


	public static void main(String[] args) {
		SpringApplication.run(ApicrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



	}

}
