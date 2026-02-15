package com.example.hms.service;

import com.example.hms.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors() {
        try{
            System.out.println("into service layer");
            return null;
        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            return null;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            return null;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id) {
        try {

        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
        }
    }

    public Doctor updateDoctor(Long id) {
        try {
            return null;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            return null;
        }
    }
}
