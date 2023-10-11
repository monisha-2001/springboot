package com.example.linkedIn;

import com.example.linkedIn.entity.Guest;
import com.example.linkedIn.entity.Reservation;
import com.example.linkedIn.entity.Room;
import com.example.linkedIn.repository.GuestRepository;
import com.example.linkedIn.repository.ReservationRepository;
import com.example.linkedIn.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LinkedInApplication {
	public static void main(String[] args) {
		SpringApplication.run(LinkedInApplication.class, args);
	}
}
