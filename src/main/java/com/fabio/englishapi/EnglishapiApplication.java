package com.fabio.englishapi;

import com.fabio.englishapi.entities.Verb;
import com.fabio.englishapi.repositories.VerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EnglishapiApplication {

	@Autowired
	private VerbRepository verbRepository;

	public static void main(String[] args) {
		SpringApplication.run(EnglishapiApplication.class, args);
	}

}
