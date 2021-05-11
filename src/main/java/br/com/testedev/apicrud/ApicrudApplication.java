package br.com.testedev.apicrud;

import br.com.testedev.apicrud.model.entities.Todo;
import br.com.testedev.apicrud.model.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@SpringBootApplication
public class ApicrudApplication implements CommandLineRunner {

	@Autowired
	private TodoRepository todoRepository;


	public static void main(String[] args) {
		SpringApplication.run(ApicrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


		Todo t1 = new Todo(null,"Estudar","Estudar SpringBoot 2 e Angular 11",
				LocalDateTime.parse("25/03/2022 10:40", formatter),false);

		todoRepository.saveAll(Arrays.asList(t1));

	}

}
