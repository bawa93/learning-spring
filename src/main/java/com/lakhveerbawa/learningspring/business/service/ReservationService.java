package com.lakhveerbawa.learningspring.business.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakhveerbawa.learningspring.business.domain.RoomReservation;
import com.lakhveerbawa.learningspring.data.repository.GuestRepository;
import com.lakhveerbawa.learningspring.data.repository.ReservationRepository;
import com.lakhveerbawa.learningspring.data.repository.RoomRepository;

@Service
public class ReservationService {
	
	private final RoomRepository roomRepository;
	private final GuestRepository guestRepository;
	private final ReservationRepository reservationRepository;
	
	
	@Autowired
	public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository,
			ReservationRepository reservationRepository) {
		super();
		this.roomRepository = roomRepository;
		this.guestRepository = guestRepository;
		this.reservationRepository = reservationRepository;
	}


	public List<RoomReservation> getRoomReservationsForDate(Date date) {
		
		return null;
	}
	

}
