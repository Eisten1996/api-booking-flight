package com.dipper.apibookingflight.domain.ticket.repository;

import com.dipper.apibookingflight.domain.ticket.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {
}
