package com.example.hms.controllers;

import com.example.hms.models.Doctor;
import com.example.hms.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        System.out.println("Fetching all doctors");
        return doctorService.getAllDoctors();
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println("Creating doctor");
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/id")
    public Doctor getDoctorById(@PathVariable Long id) {
        System.out.println("Fetching doctor by id");
        return doctorService.getDoctorById(id);
    }

    @DeleteMapping("/id")
    public void deleteDoctorById(@PathVariable Long id) {
        System.out.println("Deleting doctor by id");
        doctorService.deleteDoctor(id);
    }

    @PutMapping("/id")
    public void updateDoctorById(@PathVariable Long id) {
        System.out.println("Updating doctor by id");
        doctorService.updateDoctor(id);
    }
}
