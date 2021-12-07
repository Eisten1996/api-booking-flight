package com.dipper.apibookingflight.application.ticket;

import com.dipper.apibookingflight.domain.ticket.model.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> getAll();

    Ticket getTicket(String id);

    Ticket createTicket(Ticket ticket);

    Ticket updateTicket(Ticket ticket);

    void deleteTicket(String id);
}
