package com.dipper.apibookingflight.web.controllers;


import com.dipper.apibookingflight.domain.booking.model.Booking;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/booking")
public interface BookingApi {

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Booking>> getBookings();

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Booking> getBooking(@PathVariable("id") String id);

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Booking> createBooking(@RequestBody(required = true) Booking booking);

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Booking> updateBooking(@RequestBody(required = true) Booking booking);

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Void> deleteBooking(@PathVariable("id") String id);
}
