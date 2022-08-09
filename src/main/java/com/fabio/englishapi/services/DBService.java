package com.fabio.englishapi.services;

import com.fabio.englishapi.entities.Verb;
import com.fabio.englishapi.repositories.VerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {

    @Autowired
    private VerbRepository verbRepository;

    public void instantiateDataBases(){

        Verb verb1 = new Verb(1L,"Regular","play","played","played",
                "Jogar,brincar,tocar");

        Verb verb2 = new Verb(2L,"Irregular","speak","spoke","spoken","falar");
        Verb verb3 = new Verb(3L,"Regular","cook","cooked","cooked","cozinhar");
        Verb verb4 = new Verb(4L,"Irregular","say","said","said","dizer");

        verbRepository.saveAll(List.of(verb1,verb2,verb3,verb4));

    }

}
