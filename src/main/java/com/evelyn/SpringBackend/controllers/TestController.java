package com.evelyn.SpringBackend.controllers;

import javax.validation.Valid;

import com.evelyn.SpringBackend.models.Booking;
import com.evelyn.SpringBackend.models.Contact;
import com.evelyn.SpringBackend.payload.request.BookingRequest;
import com.evelyn.SpringBackend.payload.request.ContactRequest;
import com.evelyn.SpringBackend.repository.BookingRepository;
import com.evelyn.SpringBackend.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/services")
public class TestController {
	@Autowired
  	private ContactRepository contactRepository;

	@Autowired
	private BookingRepository bookingRepository;

	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/multi")
	@PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_MODERATOR') or hasRole('ROLE_ADMIN')")
	public String multipleAccess() {
		return "Multi Content.";
	}

	@GetMapping("/user")
	@PreAuthorize("hasRole('ROLE_USER')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/contact-listing")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Iterable<Contact> contactListing() {
		return contactRepository.findAll();
	}

	@PostMapping("/receive-message")
	@PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_MODERATOR') or hasRole('ROLE_ADMIN')")
	public String receiveMessage(@Valid @RequestBody ContactRequest contactRequest) {
		Contact contact = new Contact(
			contactRequest.getName(),
			contactRequest.getEmail(),
			contactRequest.getSubject(),
			contactRequest.getMessage()
			);
			contactRepository.save(contact);
		return "Message stored successfully in the dB";
	}

	@GetMapping("/booking-listing")
	@PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_MODERATOR') or hasRole('ROLE_ADMIN')")
	public Iterable<Booking> bookingListing() {
		return bookingRepository.findAll();
	}

	@PostMapping("/add-booking")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String addBooking(@Valid @RequestBody BookingRequest bookingRequest) {
		
		Booking booking = new Booking(
			bookingRequest.getName(),
			bookingRequest.getEmail(),
			bookingRequest.getPhone(),
			bookingRequest.getDate(),
			bookingRequest.getTime(),
			bookingRequest.getPeople(),
			bookingRequest.getMessage()
			);
			bookingRepository.save(booking);

		return "Booking stored successfully in the dB";
	}
}
