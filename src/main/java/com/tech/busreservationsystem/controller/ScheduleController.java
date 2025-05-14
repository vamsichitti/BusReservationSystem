package com.tech.busreservationsystem.controller;

import com.tech.busreservationsystem.model.Schedule;
import com.tech.busreservationsystem.service.ScheduleService;
import com.tech.busreservationsystem.service.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;
    @GetMapping("/getAllSchedules")
    public ResponseEntity<List<Schedule>> listAllTheSchedules(){
       List<Schedule> scheduleList= scheduleService.getAllSchedules();
       return new ResponseEntity<>(scheduleList, HttpStatus.OK);
    }

}
