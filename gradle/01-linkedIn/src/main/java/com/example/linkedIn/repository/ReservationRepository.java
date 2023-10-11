package com.example.linkedIn.repository;

import com.example.linkedIn.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Long> {

    //this is a method for resrevation through date
    Iterable<Reservation> finalReservationByReservationDate(Date date);
}
