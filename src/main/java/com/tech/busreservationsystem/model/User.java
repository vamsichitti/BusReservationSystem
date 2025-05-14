package com.tech.busreservationsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "\"user\"")
public class User {
//    userId: Long (Primary Key)
//    username: String
//    password: String
//    email: String
//    role: String (e.g., ADMIN, USER)
//    bookings: List<Booking> (One-to-Many)
    @Id
    private Long userId;
    private String username;
    private String password;
    private String email;
    private UserRole role;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Booking> bookingList;

}
