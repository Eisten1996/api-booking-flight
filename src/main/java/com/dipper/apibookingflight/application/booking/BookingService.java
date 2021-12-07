package com.dipper.apibookingflight.application.booking;

import com.dipper.apibookingflight.domain.booking.model.Booking;

import java.util.List;

public interface BookingService {

    List<Booking> getAll();

    Booking getBooking(String id);

    Booking createBooking(Booking booking);

    Booking updateBooking(Booking booking);

    void deleteBooking(String id);
}
