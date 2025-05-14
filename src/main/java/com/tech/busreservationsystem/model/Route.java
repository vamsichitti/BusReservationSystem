package com.tech.busreservationsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Data
public class Route {
//    routeId: Long (Primary Key)
//    fromLocation: String
//    toLocation: String
//    distance: Double
//    buses: List<Bus> (One-to-Many)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long routeId;
    @Column
    private String fromLocation;
    @Column
    private String toLocation;
    @OneToMany(mappedBy = "route",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Bus> busList;
}
