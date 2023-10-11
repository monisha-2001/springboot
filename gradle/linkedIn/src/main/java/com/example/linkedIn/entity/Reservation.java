package com.example.linkedIn.entity;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reservtionId;

    @Column(name = "ROOM_ID")
    private long roomId;

    @Column(name = "GUEST_ID")
    private long guestId;

    @Column(name = "RES_DATE")
    private Date reservationDate;

    public Reservation(long reservtionId, long roomId, long guestId, Date reservationDate) {
        this.reservtionId = reservtionId;
        this.roomId = roomId;
        this.guestId = guestId;
        this.reservationDate = reservationDate;
    }

    public long getReservtionId() {
        return reservtionId;
    }

    public void setReservtionId(long reservtionId) {
        this.reservtionId = reservtionId;
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

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
