package com.example.hms.service;

import com.example.hms.models.Doctor;
import com.example.hms.repository.DoctorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        try{
            System.out.println("into service layer");
            return doctorRepository.findAll();
        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while fetching all doctors : {}",  e.getMessage());
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            Optional<Doctor> doctor = doctorRepository.findById(id);
            return doctor.orElse(null);
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while fetching doctor with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            doctorRepository.save(doctor);
            return doctor;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while creating doctor : {}",  e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id) {
        try {
            logger.info("deleting doctor with id {}", id);
            doctorRepository.deleteById(id);
        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while deleting doctor with Id {} : {}", id, e.getMessage());
        }
    }

    public Doctor updateDoctor(Long id,  Doctor updatedDoctor) {
        try {
            Optional<Doctor> existingDoctor = doctorRepository.findById(id);
            if(existingDoctor.isPresent()) {
                Doctor d = existingDoctor.get();
                d.setName(updatedDoctor.getName());
                d.setAge(updatedDoctor.getAge());
                doctorRepository.save(d);

                return updatedDoctor;
            }else {
                logger.error("Doctor with id {} not found", id);
                return null;
            }
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while updating doctor with Id {} : {}", id, e.getMessage());
            return null;
        }
    }
}
