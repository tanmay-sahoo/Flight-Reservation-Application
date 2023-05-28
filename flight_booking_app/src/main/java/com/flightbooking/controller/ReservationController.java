package com.flightbooking.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import com.flightbooking.dto.ReservationRequest;
import com.flightbooking.entities.Passenger;
import com.flightbooking.entities.Reservation;
import com.flightbooking.repositories.PassengerRepository;
import com.flightbooking.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	@RequestMapping("/confirmReservation")
	public String confirmLogin(ReservationRequest request, ModelMap modelMap) {
		Reservation reservationId = reservationService.bookFlight(request);
		//modelMap.addAttribute("reservationId", reservationId.getId());
		long id = reservationId.getId();
		Optional<Passenger> findById = passengerRepo.findById(id);
		Passenger passenger = findById.get();
		modelMap.addAttribute("passenger",passenger);
		return "confirmReservation";
	}
	
	@RequestMapping("/showPayment")
	public String showPayment() {
		return "";
	}
}
