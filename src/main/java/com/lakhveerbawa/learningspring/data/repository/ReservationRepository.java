package com.lakhveerbawa.learningspring.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.lakhveerbawa.learningspring.data.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

	public String name();
}
