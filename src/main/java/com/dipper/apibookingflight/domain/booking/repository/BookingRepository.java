package com.dipper.apibookingflight.domain.booking.repository;

import com.dipper.apibookingflight.domain.booking.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking, String> {
}
