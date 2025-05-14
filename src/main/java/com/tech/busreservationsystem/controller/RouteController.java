package com.tech.busreservationsystem.controller;

import com.tech.busreservationsystem.model.Bus;
import com.tech.busreservationsystem.model.Route;
import com.tech.busreservationsystem.repository.RouteRepository;
import com.tech.busreservationsystem.service.RouteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.RouteMatcher;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/route")
public class RouteController {
    @Autowired
    private RouteServiceImpl routeService;

    @Autowired
    private RouteRepository routeRepository;

    @GetMapping("/getallroutes")
    public ResponseEntity<List<Route>> getAllRoutes(){
        List<Route> routeList = routeService.getAllRoutes();
        return new ResponseEntity<>(routeList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Route> addNewRoute(@RequestBody Route route){
        Route newRoute =  routeService.addNewRoute(route);
        return new ResponseEntity<>(newRoute,HttpStatus.OK);
    }

    @PostMapping("routeId/{id}")
    public ResponseEntity<Route> addBusToRoute(@PathVariable Long id,@RequestBody Bus bus){
       Route route = routeService.addBusToRoute(id,bus);
       return new ResponseEntity<>(route,HttpStatus.OK);
    }
}
