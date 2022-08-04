package com.fabio.englishapi;

import com.fabio.englishapi.entities.Verb;
import com.fabio.englishapi.repositories.VerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EnglishapiApplication implements CommandLineRunner {

	@Autowired
	private VerbRepository verbRepository;

	public static void main(String[] args) {
		SpringApplication.run(EnglishapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Verb verb1 = new Verb(1L,"Regular","play","played","played",
				"Jogar,brincar,tocar");

		Verb verb2 = new Verb(2L,"Irregular","speak","spoke","spoken","falar");
		Verb verb3 = new Verb(3L,"Regular","cook","cooked","cooked","cozinhar");
		Verb verb4 = new Verb(4L,"Irregular","say","said","said","dizer");

		verbRepository.saveAll(List.of(verb1,verb2,verb3,verb4));
	}
}
