package com.dipper.apibookingflight.web.controllers;

import com.dipper.apibookingflight.application.booking.BookingService;
import com.dipper.apibookingflight.domain.booking.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BookingApiController implements BookingApi {

    @Autowired
    BookingService bookingService;

    @Override
    public ResponseEntity<List<Booking>> getBookings() {
        return new ResponseEntity<>(bookingService.getAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Booking> getBooking(String id) {
        return new ResponseEntity<>(bookingService.getBooking(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Booking> createBooking(Booking booking) {
        return new ResponseEntity<>(bookingService.createBooking(booking), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Booking> updateBooking(Booking booking) {
        return new ResponseEntity<>(bookingService.updateBooking(booking), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteBooking(String id) {
        bookingService.deleteBooking(id);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
