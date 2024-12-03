package com.sairaj.HotelManagement.service.interfac;

import com.sairaj.HotelManagement.dto.Response;
import com.sairaj.HotelManagement.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
