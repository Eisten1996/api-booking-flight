package com.dipper.apibookingflight.domain.booking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Booking")
public class Booking {
    @Id
    private String orderRef;

    private String name;
    private String surname;
    private String contact;
    private String gender;
    private String availableClass;
    private String destination;
    private Integer seats;
    private Date date;
    private String transaction;
    private String account;
    private Double amount;

    public Booking() {
    }

    public Booking(String orderRef, String name, String surname, String contact, String gender, String availableClass,
                   String destination, Integer seats, Date date, String transaction, String account, Double amount) {
        this.orderRef = orderRef;
        this.name = name;
        this.surname = surname;
        this.contact = contact;
        this.gender = gender;
        this.availableClass = availableClass;
        this.destination = destination;
        this.seats = seats;
        this.date = date;
        this.transaction = transaction;
        this.account = account;
        this.amount = amount;
    }

    public String getOrderRef() {
        return orderRef;
    }

    public void setOrderRef(String orderRef) {
        this.orderRef = orderRef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvailableClass() {
        return availableClass;
    }

    public void setAvailableClass(String availableClass) {
        this.availableClass = availableClass;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
