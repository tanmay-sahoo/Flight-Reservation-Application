package com.flightbooking.service;

import com.flightbooking.dto.ReservationRequest;
import com.flightbooking.entities.Reservation;

public interface ReservationService {
	Reservation bookFlight(ReservationRequest request);
}
