package com.dipper.apibookingflight.domain.transaction.repository;

import com.dipper.apibookingflight.domain.transaction.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
}
