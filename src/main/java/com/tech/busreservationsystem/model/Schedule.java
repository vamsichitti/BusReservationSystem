package com.tech.busreservationsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Schedule {
//    scheduleId: Long (Primary Key)
//    bus: Bus (Many-to-One)
//    departureTime: LocalDateTime
//    arrivalTime: LocalDateTime
//    availableSeats: Integer
//    bookings: List<Booking> (One-to-Many)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;
    @ManyToOne
    private Bus bus;
    @Column
    private LocalDateTime departureTime;
    @Column
    private LocalDateTime arrivalTime;
    @Column
    private int availableSeats;
    @OneToMany(mappedBy = "schedule")
    private List<Booking> bookingList;

}
