package com.example.hms.controllers;

import com.example.hms.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @GetMapping
    public List<Patient> getPatients() {
        System.out.println("Fetching the patients");
        return null;
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        System.out.println("Creating a new patient");
        return patient;
    }

    @GetMapping("/id")
    public Patient getPatientById(@PathVariable Long id) {
        System.out.println("Fetching the patient by id");
        return null;
    }

    @DeleteMapping("/id")
    public void deletePatient(@PathVariable Long id) {
        System.out.println("Deleting the patient by id" + id);
    }

    @PutMapping("/id")
    public void updatePatient(@PathVariable Long id) {
        System.out.println("Updating the patient by id" + id);
    }

}
