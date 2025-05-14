package com.tech.busreservationsystem.service;

import com.tech.busreservationsystem.model.Bus;
import com.tech.busreservationsystem.model.Route;

import java.util.List;

public interface RouteService {

     List<Route> getTheBusByFromLocationToLocation(String fromLocation,String toLocation);
     Route addNewRoute(Route route);

     Route addBusToRoute(Long routeId, Bus bus );

     List<Route> getAllRoutes();
}
