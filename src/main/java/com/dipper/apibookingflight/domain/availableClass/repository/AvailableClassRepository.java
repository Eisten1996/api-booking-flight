package com.dipper.apibookingflight.domain.availableClass.repository;

import com.dipper.apibookingflight.domain.availableClass.model.AvailableClass;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvailableClassRepository extends MongoRepository<AvailableClass, String> {
}
