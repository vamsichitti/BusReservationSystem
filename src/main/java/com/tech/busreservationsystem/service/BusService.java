package com.tech.busreservationsystem.service;

import com.tech.busreservationsystem.model.Bus;

import java.util.List;

public interface BusService {
    public Bus createBus(Bus bus);

    List<Bus> getAllBuses();
}
