package com.dipper.apibookingflight.web.controllers;

import com.dipper.apibookingflight.domain.ticket.model.Ticket;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/ticket")
public interface TicketApi {
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Ticket>> getTickets();

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Ticket> getTicket(@PathVariable("id") String id);

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Ticket> createTicket(@RequestBody(required = true) Ticket ticket);

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Ticket> updateTicket(@RequestBody(required = true) Ticket ticket);

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Void> deleteTicket(@PathVariable("id") String id);
}
