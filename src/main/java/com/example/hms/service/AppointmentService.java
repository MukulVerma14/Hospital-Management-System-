package com.example.hms.service;

import com.example.hms.models.Appointment;
import com.example.hms.repository.AppointmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        try{
            System.out.println("into service layer");
            return appointmentRepository.findAll();
        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while fetching all appointments : {}", e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            Optional<Appointment> appointment = appointmentRepository.findById(id);
            return appointment.orElse(null);
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while fetching appointment with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            appointmentRepository.save(appointment);
            return appointment;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while creating appointment : {}", e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id) {
        try {
            logger.info("deleting appointment with id {}", id);
            appointmentRepository.deleteById(id);
        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while deleting appointment with Id {} : {}", id, e.getMessage());
        }
    }

    public Appointment updateAppointment(Long id, Appointment appointment) {
        try {
            Optional<Appointment> appointment1 = appointmentRepository.findById(id);
            if(appointment1.isPresent()) {
                Appointment a =  appointment1.get();
                a.setId(appointment.getId());
                appointmentRepository.save(a);
                return a;
            }else {
                logger.error("Appointment with id {} not found", id);
                return null;
            }
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while updating appointment with Id {} : {}", id, e.getMessage());
            return null;
        }
    }
}
