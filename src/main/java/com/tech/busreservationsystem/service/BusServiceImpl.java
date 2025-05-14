package com.tech.busreservationsystem.service;

import com.tech.busreservationsystem.model.Bus;
import com.tech.busreservationsystem.model.Route;
import com.tech.busreservationsystem.model.Schedule;
import com.tech.busreservationsystem.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
@Service
public class BusServiceImpl implements BusService{

    @Autowired
    BusRepository busRepo;

    @Override
    public Bus createBus(Bus bus) {
        Route route = new Route();
        List<Schedule> scheduleList = new ArrayList<>();
//        Bus newBus = Bus.builder()
//                .busNumber("AP03CE5042")
//                .capacity(25)
//                .route(route)
//                .shedulesList(scheduleList)
//                .build();
        Bus newBus = Bus.builder()
                .busNumber(bus.getBusNumber())
                .capacity(bus.getCapacity())
                .route(bus.getRoute())
                .shedulesList(bus.getShedulesList())
                .build();
       return busRepo.save(newBus);

    }

    @Override
    public List<Bus> getAllBuses() {
        List<Bus> busList = busRepo.findAll();
        return busList;
    }
}
