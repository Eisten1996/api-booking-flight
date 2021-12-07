package com.dipper.apibookingflight.web.controllers;

import com.dipper.apibookingflight.application.ticket.TicketService;
import com.dipper.apibookingflight.domain.ticket.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TicketApiController implements TicketApi {

    @Autowired
    TicketService ticketService;

    @Override
    public ResponseEntity<List<Ticket>> getTickets() {
        return new ResponseEntity<>(ticketService.getAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Ticket> getTicket(String id) {
        return new ResponseEntity<>(ticketService.getTicket(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Ticket> createTicket(Ticket ticket) {
        return new ResponseEntity<>(ticketService.createTicket(ticket), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Ticket> updateTicket(Ticket ticket) {
        return new ResponseEntity<>(ticketService.updateTicket(ticket), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteTicket(String id) {
        ticketService.deleteTicket(id);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
