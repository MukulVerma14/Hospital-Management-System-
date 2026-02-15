package com.example.hms.controllers;

import com.example.hms.models.Appointment;
import com.example.hms.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAllAppointments() {
        System.out.println("Getting all appointments");
        return appointmentService.getAllAppointments();
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        System.out.println("Creating a new appointment");
        return  appointmentService.createAppointment(appointment);
    }

    @GetMapping("/id")
    public Appointment getAppointmentById(@PathVariable Long id) {
        System.out.println("Getting appointment by id");
        return appointmentService.getAppointmentById(id);
    }

    @DeleteMapping("/id")
    public void deleteAppointment(@PathVariable Long id) {
        System.out.println("Deleting appointment by id" + id);
        appointmentService.deleteAppointment(id);
    }

    @PutMapping("/id")
    public void updateAppointment(@PathVariable Long id) {
        System.out.println("Updating appointment by id" + id);
        appointmentService.updateAppointment(id);
    }
}
