package com.fabio.englishapi.services;

import com.fabio.englishapi.dtos.VerbDto;
import com.fabio.englishapi.entities.Verb;
import com.fabio.englishapi.exceptions.ObjectNotFoundException;
import com.fabio.englishapi.repositories.VerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VerbService {

    @Autowired
    private VerbRepository verbRepository;

    @Transactional
    public List<VerbDto> findAll(){
        return  verbRepository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Transactional
    public VerbDto save(VerbDto verbDto){
        return toDto(verbRepository.save(toVerb(verbDto)));
    }

    @Transactional
    public VerbDto findById(Long id){
        return toDto(verbRepository.findById(id)
                .orElseThrow(()-> new ObjectNotFoundException("Verb not found with id -> "+id)));
    }

    @Transactional
    public VerbDto updateById(Long id, VerbDto verbDto){
        findById(id);
        return toDto(verbRepository.save(toVerb(verbDto)));
    }

    @Transactional
    public void deleteById(Long id){
        findById(id);
        verbRepository.deleteById(id);
    }


    public VerbDto toDto(Verb verb){
        return new VerbDto(verb.getId(),verb.getType(),verb.getInfinitive(),
        verb.getPast(),verb.getParticiple(), verb.getPortuguese());
    }

    public Verb toVerb(VerbDto verbDto){
        return new Verb(verbDto.getId(),verbDto.getType(),verbDto.getInfinitive(),
                verbDto.getPast(),verbDto.getParticiple(), verbDto.getPortuguese());
    }


}
