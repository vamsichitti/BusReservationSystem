package com.tech.busreservationsystem.service;

import com.tech.busreservationsystem.model.Bus;
import com.tech.busreservationsystem.model.Route;
import com.tech.busreservationsystem.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceImpl implements RouteService{

    private RouteRepository routeRepository;
    @Autowired
    public RouteServiceImpl(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Override
    public List<Route> getTheBusByFromLocationToLocation(String fromLocation, String toLocation) {
        return null;
    }

    @Override
    public Route addNewRoute(Route route) {
        Route newRoute = Route.builder()
                .fromLocation(route.getFromLocation())
                .toLocation(route.getToLocation())
                .build();
        return routeRepository.save(route);
    }

    @Override
    public Route addBusToRoute(Long routeId, Bus bus) {
        Optional<Route> route = routeRepository.findById(routeId);
        List<Bus> busList = new ArrayList<>();
        busList.add(bus);
        if(route.isPresent()){
            route.get().setBusList(busList);
        }
        return routeRepository.save(route.get());
    }

    @Override
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }
}
