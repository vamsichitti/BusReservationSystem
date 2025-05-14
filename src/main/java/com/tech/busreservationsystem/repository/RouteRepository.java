package com.tech.busreservationsystem.repository;

import com.tech.busreservationsystem.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route,Long> {
}
