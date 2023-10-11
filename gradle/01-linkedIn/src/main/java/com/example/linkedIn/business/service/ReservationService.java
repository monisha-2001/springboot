package com.example.linkedIn.business.service;

import com.example.linkedIn.business.domain.RoomReservation;
import com.example.linkedIn.entity.Guest;
import com.example.linkedIn.entity.Reservation;
import com.example.linkedIn.entity.Room;
import com.example.linkedIn.repository.GuestRepository;
import com.example.linkedIn.repository.ReservationRepository;
import com.example.linkedIn.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReservationService {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    //whenever we use we need to initialize the fields so we hv defined constructor
    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomReservation> getRoomReservationForDate(Date date){
        Iterable<Room> rooms=this.roomRepository.findAll();
        Map<Long,RoomReservation> roomReservationMap=new HashMap<>();
        rooms.forEach(room -> {
            RoomReservation roomReservation=new RoomReservation();
            roomReservation.setRoomId(room.getRoomId());
            roomReservation.setRoomName(room.getRoomName());
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservationMap.put(room.getRoomId(), roomReservation);

        });
        Iterable<Reservation> reservation = this.reservationRepository.finalReservationByReservationDate(new java.sql.Date(date.getTime()));
        reservation.forEach(reservation1 -> {
            RoomReservation roomReservation = roomReservationMap.get(reservation1.getRoomId());
            roomReservation.setDate(date);
            Guest guest = this.guestRepository.findById(reservation1.getGuestId()).get();
            roomReservation.setFirstName(guest.getFirstName());
            roomReservation.setLastName(guest.getLastName());
            roomReservation.setGuestId(guest.getGuestId());
        });
        List<RoomReservation> roomReservations = new ArrayList<>();
        for (Long id: roomReservationMap.keySet()){
            roomReservations.add(roomReservationMap.get(id));
        }
        return roomReservations;
    }
}
