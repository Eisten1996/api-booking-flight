package com.dipper.apibookingflight.domain.transaction.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Transaction {

    @Id
    private String transactionId;

    private String status;
    private String travelClass;
    private String paymentVia;
    private Double amount;

    public Transaction() {
    }

    public Transaction(String transactionId, String status, String travelClass, String paymentVia, Double amount) {
        this.transactionId = transactionId;
        this.status = status;
        this.travelClass = travelClass;
        this.paymentVia = paymentVia;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public String getPaymentVia() {
        return paymentVia;
    }

    public void setPaymentVia(String paymentVia) {
        this.paymentVia = paymentVia;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
