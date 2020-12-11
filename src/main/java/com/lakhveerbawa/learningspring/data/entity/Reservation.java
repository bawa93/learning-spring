package com.lakhveerbawa.learningspring.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

	@Id
	@Column(name = "RESERVATION_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reservationId;
	
	@Column(name = "ROOM_ID")
	private long roomId;
	
	@Column(name = "GUEST_ID")
	private long guestId;
	
	@Column(name = "RES_DATE")
	private String res_date;

	public long getReservationId() {
		return reservationId;
	}

	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public long getGuestId() {
		return guestId;
	}

	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}

	public String getRes_date() {
		return res_date;
	}

	public void setRes_date(String res_date) {
		this.res_date = res_date;
	}
	
	
}
