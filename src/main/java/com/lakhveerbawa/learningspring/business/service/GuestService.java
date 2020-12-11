package com.lakhveerbawa.learningspring.business.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakhveerbawa.learningspring.data.entity.Guest;
import com.lakhveerbawa.learningspring.data.repository.GuestRepository;

@Service
public class GuestService {

	private GuestRepository guestRepository;
	
	@Autowired
	public GuestService(GuestRepository guestRepository) {
		super();
		this.guestRepository = guestRepository;
	}


	public List<Guest> getGuestList() {
		Iterable<Guest> guests = this.guestRepository.findAll();
		
		List<Guest> guestsList = new ArrayList<>();
		
		guests.forEach(guest -> {
			guestsList.add(guest);
		});
		
		guestsList.sort(new Comparator<Guest>() {
			@Override
			
			public int compare(Guest o1, Guest o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		
		return guestsList;
		
		
	}
}
