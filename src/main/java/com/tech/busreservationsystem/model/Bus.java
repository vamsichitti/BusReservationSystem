package com.tech.busreservationsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Bus {

//    busId: Long (Primary Key)
//    busNumber: String
//    capacity: Integer
//    route: Route (Many-to-One)
//    schedules: List<Schedule> (One-to-Many)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;
    @Column
    private String busNumber;
    @Column
    private int capacity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Route route;
    @Column
    @OneToMany(mappedBy = "bus",cascade = CascadeType.ALL)
    private List<Schedule> shedulesList;
}
