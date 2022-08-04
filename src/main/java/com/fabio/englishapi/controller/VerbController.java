package com.fabio.englishapi.controller;

import com.fabio.englishapi.dtos.VerbDto;
import com.fabio.englishapi.services.VerbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/${api.version}/verbs")
public class VerbController {

    @Autowired
    private VerbService verbService;

    @GetMapping
    public ResponseEntity<List<VerbDto>> findAll(){
        return ResponseEntity.ok(verbService.findAll());
    }

    @PostMapping
    public ResponseEntity<VerbDto> saveVerb(@Valid @RequestBody VerbDto verbDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(verbService.save(verbDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<VerbDto> findById(@PathVariable Long id){
        return ResponseEntity.ok(verbService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VerbDto> updateById(@PathVariable Long id, @Valid @RequestBody VerbDto verbDto){
        return ResponseEntity.ok(verbService.updateById(id,verbDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        verbService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
