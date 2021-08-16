package com.evelyn.SpringBackend.repository;

import com.evelyn.SpringBackend.models.Booking;

import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Integer> {
    
}
