package com.dipper.apibookingflight.application.transaction;

import com.dipper.apibookingflight.domain.transaction.model.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> getAll();

    Transaction getTransaction(String id);

    Transaction createTransaction(Transaction transaction);

    Transaction updateTransaction(Transaction transaction);

    void deleteTransaction(String id);
}
