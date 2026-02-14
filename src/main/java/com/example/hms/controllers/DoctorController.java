package com.example.hms.controllers;

import com.example.hms.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @GetMapping
    public List<Doctor> getAllDoctors() {
        System.out.println("Fetching all doctors");
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println("Creating doctor");
        return null;
    }

    @GetMapping("/id")
    public Doctor getDoctorById(@PathVariable Long id) {
        System.out.println("Fetching doctor by id");
        return null;
    }

    @DeleteMapping("/id")
    public void deleteDoctorById(@PathVariable Long id) {
        System.out.println("Deleting doctor by id");
    }

    @PutMapping("/id")
    public Doctor updateDoctorById(@RequestBody Doctor doctor) {
        System.out.println("Updating doctor by id");
        return null;
    }
}
