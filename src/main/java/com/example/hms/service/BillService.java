package com.example.hms.service;

import com.example.hms.models.Bill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    public List<Bill> getAllBills() {
        try{
            System.out.println("into service layer");
            return null;
        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while fetching all bills : {}", e.getMessage());
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            return null;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while fetching bill with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            return null;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while creating doctor  : {}", e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id) {
        try {

        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while deleting bill with Id {} : {}", id, e.getMessage());
        }
    }

    public Bill updateBill(Long id) {
        try {
            return null;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while updating bill with Id {} : {}", id, e.getMessage());
            return null;
        }
    }
}
