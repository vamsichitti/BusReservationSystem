package com.tech.busreservationsystem.controller;

import com.tech.busreservationsystem.model.Bus;
import com.tech.busreservationsystem.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    BusService busService;
    @PostMapping("/createBus")
    public ResponseEntity<Bus> addNewBus(@RequestBody Bus bus){
       Bus createdBus = busService.createBus(bus);
       return new ResponseEntity<Bus>(createdBus, HttpStatus.CREATED);
    }

    @GetMapping("/getAllBus")
    public ResponseEntity<List<Bus>> getAllBusList(){
        List<Bus> busList = busService.getAllBuses();
        return new ResponseEntity<List<Bus>>(busList,HttpStatus.OK);
    }
}
