package com.tech.busreservationsystem.service;

import com.tech.busreservationsystem.model.Schedule;
import com.tech.busreservationsystem.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScheduleServiceImpl implements ScheduleService{
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Override
    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }
}
