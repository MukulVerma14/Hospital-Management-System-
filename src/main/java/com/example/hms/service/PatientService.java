package com.example.hms.service;

import com.example.hms.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public List<Patient> getAllPatients() {
        try{
            System.out.println("into service layer");
            return null;
        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while fetching all patients : {}", e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(Long id) {
        try {
            return null;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while fetching patient with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            return null;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while creating patient : {}", e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id) {
        try {

        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while deleting patient with Id {} : {}", id, e.getMessage());
        }
    }

    public Patient updatePatient(Long id) {
        try {
            return null;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while updating patient with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

}
