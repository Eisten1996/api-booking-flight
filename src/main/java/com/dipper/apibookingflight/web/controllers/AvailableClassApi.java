package com.dipper.apibookingflight.web.controllers;


import com.dipper.apibookingflight.domain.availableClass.model.AvailableClass;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/available")
public interface AvailableClassApi {

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<AvailableClass>> getAvailableClassAll();

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AvailableClass> getAvailableClass(@PathVariable("id") String id);

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AvailableClass> createAvailableClass(@RequestBody(required = true) AvailableClass availableClass);

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AvailableClass> updateAvailableClass(@RequestBody(required = true) AvailableClass availableClass);

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Void> deleteAvailableClass(@PathVariable("id") String id);
}
