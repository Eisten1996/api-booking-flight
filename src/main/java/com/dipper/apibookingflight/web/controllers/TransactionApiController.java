package com.dipper.apibookingflight.web.controllers;

import com.dipper.apibookingflight.application.transaction.TransactionService;
import com.dipper.apibookingflight.domain.transaction.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TransactionApiController implements TransactionApi {

    @Autowired
    TransactionService transactionService;

    @Override
    public ResponseEntity<List<Transaction>> getTransactions() {
        return new ResponseEntity<>(transactionService.getAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Transaction> getTransaction(String id) {
        return new ResponseEntity<>(transactionService.getTransaction(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Transaction> createTransaction(Transaction transaction) {
        return new ResponseEntity<>(transactionService.createTransaction(transaction), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Transaction> updateTransaction(Transaction transaction) {
        return new ResponseEntity<>(transactionService.updateTransaction(transaction), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteTransaction(String id) {
        transactionService.deleteTransaction(id);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
