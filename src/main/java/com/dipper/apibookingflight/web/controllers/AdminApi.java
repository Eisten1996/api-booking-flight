package com.dipper.apibookingflight.web.controllers;

import com.dipper.apibookingflight.domain.admin.model.Admin;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/admin")
public interface AdminApi {

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Admin>> getAdmins();

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Admin> getAdmin(@PathVariable("id") String id);

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Admin> createAdmin(@RequestBody(required = true) Admin admin);

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Admin> updateAdmin(@RequestBody(required = true) Admin admin);

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Void> deleteAdmin(@PathVariable("id") String id);
}
