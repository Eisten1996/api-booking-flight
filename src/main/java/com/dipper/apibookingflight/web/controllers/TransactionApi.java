package com.dipper.apibookingflight.web.controllers;

import com.dipper.apibookingflight.domain.transaction.model.Transaction;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/transaction")
public interface TransactionApi {
    
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Transaction>> getTransactions();

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Transaction> getTransaction(@PathVariable("id") String id);

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Transaction> createTransaction(@RequestBody(required = true) Transaction transaction);

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Transaction> updateTransaction(@RequestBody(required = true) Transaction transaction);

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Void> deleteTransaction(@PathVariable("id") String id);
}
