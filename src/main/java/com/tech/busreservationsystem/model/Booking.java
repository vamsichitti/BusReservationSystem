package com.tech.busreservationsystem.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Booking {
//    bookingId: Long (Primary Key)
//    user: User (Many-to-One)
//    schedule: Schedule (Many-to-One)
//    seatNumbers: List<String>
//    bookingDate: LocalDateTime
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    @ManyToOne
    private Schedule schedule;
    @Column
    private List<String> seatNumbers;
    @Column
    private LocalDateTime bookingDate;
    @ManyToOne
    private User user;
}
