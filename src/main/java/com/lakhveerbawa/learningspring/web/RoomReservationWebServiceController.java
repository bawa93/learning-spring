package com.lakhveerbawa.learningspring.web;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lakhveerbawa.learningspring.business.domain.RoomReservation;
import com.lakhveerbawa.learningspring.business.service.ReservationService;

@RestController
@RequestMapping("/api/reservations")
public class RoomReservationWebServiceController {

	private final ReservationService reservationService;
	
	public RoomReservationWebServiceController(ReservationService reservationService) {
		super();
		this.reservationService = reservationService;
	}

	@GetMapping
	public List<RoomReservation> getRoomReservations(@RequestParam(name = "date", required= false) String dateString) {
		Date date = DateUtils.createDateFromDateString(dateString);
		
		return this.reservationService.getRoomReservationsForDate(date);
	}
}
