package com.flightbooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbooking.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
