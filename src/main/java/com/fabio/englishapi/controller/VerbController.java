package com.fabio.englishapi.controller;

import com.fabio.englishapi.dtos.VerbDto;
import com.fabio.englishapi.services.VerbService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/${api.version}/verbs")
@Api(tags = "Verb Controller")
public class VerbController {

    @Autowired
    private VerbService verbService;

    @GetMapping
    @ApiOperation(value = "Find all verbs")
    public ResponseEntity<List<VerbDto>> findAll(){
        return ResponseEntity.ok(verbService.findAll());
    }

    @PostMapping
    @ApiOperation(value = "Create a verb")
    public ResponseEntity<VerbDto> saveVerb(@Valid @RequestBody VerbDto verbDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(verbService.save(verbDto));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Find a verb by id")
    public ResponseEntity<VerbDto> findById(@PathVariable Long id){
        return ResponseEntity.ok(verbService.findById(id));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update a verb by id")
    public ResponseEntity<VerbDto> updateById(@PathVariable Long id, @Valid @RequestBody VerbDto verbDto){
        return ResponseEntity.ok(verbService.updateById(id,verbDto));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete a verb by id")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        verbService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
