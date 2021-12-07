package com.dipper.apibookingflight.domain.ticket.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Ticket")
public class Ticket {
    @Id
    private String ticketRef;

    private String orderRef;
    private String travelClass;
    private Date date;
    private String destination;

    public Ticket() {
    }

    public Ticket(String ticketRef, String orderRef, String travelClass, Date date, String destination) {
        this.ticketRef = ticketRef;
        this.orderRef = orderRef;
        this.travelClass = travelClass;
        this.date = date;
        this.destination = destination;
    }

    public String getTicketRef() {
        return ticketRef;
    }

    public void setTicketRef(String ticketRef) {
        this.ticketRef = ticketRef;
    }

    public String getOrderRef() {
        return orderRef;
    }

    public void setOrderRef(String orderRef) {
        this.orderRef = orderRef;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
