package com.lakhveerbawa.learningspring.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lakhveerbawa.learningspring.business.service.GuestService;
import com.lakhveerbawa.learningspring.data.entity.Guest;

@Controller
@RequestMapping("/guests")
public class GuestWebController {
	
	private final GuestService guestService;
	public GuestWebController(GuestService guestService) {
		super();
		this.guestService = guestService;
	}
	@GetMapping
	public String getGuestsList(Model model) {
		List<Guest> guests = this.guestService.getGuestList();
		
		model.addAttribute("guests", guests);
		
		return "guests";
	}

}
