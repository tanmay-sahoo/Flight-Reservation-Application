package com.flightbooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.flightbooking.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	

}
