package com.example.hms.controllers;

import com.example.hms.models.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @GetMapping
    public List<Appointment> getAllAppointments() {
        System.out.println("Getting all appointments");
        return null;
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        System.out.println("Creating a new appointment");
        return appointment;
    }

    @GetMapping("/id")
    public Appointment getAppointmentById(@PathVariable Long id) {
        System.out.println("Getting appointment by id");
        return null;
    }

    @DeleteMapping("/id")
    public void deleteAppointment(@PathVariable Long id) {
        System.out.println("Deleting appointment by id" + id);
    }

    @PutMapping("/id")
    public void updateAppointment(@PathVariable Long id) {
        System.out.println("Updating appointment by id" + id);
    }
}
