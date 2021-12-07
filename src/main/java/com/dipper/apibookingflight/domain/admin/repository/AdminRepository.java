package com.dipper.apibookingflight.domain.admin.repository;

import com.dipper.apibookingflight.domain.admin.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {
}
