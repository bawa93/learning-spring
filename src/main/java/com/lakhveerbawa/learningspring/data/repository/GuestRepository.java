package com.lakhveerbawa.learningspring.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.lakhveerbawa.learningspring.data.entity.Guest;

public interface GuestRepository extends CrudRepository<Guest, Long> {

	
}
