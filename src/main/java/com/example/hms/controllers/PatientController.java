package com.example.hms.controllers;

import com.example.hms.models.Patient;
import com.example.hms.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getPatients() {
        System.out.println("Fetching the patients");
        return patientService.getAllPatients();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        System.out.println("Creating a new patient");
        return patientService.createPatient(patient);
    }

    @GetMapping("/id")
    public Patient getPatientById(@PathVariable Long id) {
        System.out.println("Fetching the patient by id");
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/id")
    public void deletePatient(@PathVariable Long id) {
        System.out.println("Deleting the patient by id" + id);
        patientService.deletePatient(id);
    }

    @PutMapping("/id")
    public void updatePatient(@PathVariable Long id) {
        System.out.println("Updating the patient by id" + id);
        patientService.updatePatient(id);
    }

}
