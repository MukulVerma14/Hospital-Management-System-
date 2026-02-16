package com.example.hms.service;

import com.example.hms.models.Bill;
import com.example.hms.repository.BillRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    @Autowired
    private BillRepository billRepository;

    public List<Bill> getAllBills() {
        try{
            System.out.println("into service layer");
            return billRepository.findAll();
        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while fetching all bills : {}", e.getMessage());
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            Optional<Bill> bill = billRepository.findById(id);
            return bill.orElse(null);
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while fetching bill with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            billRepository.save(bill);
            return bill;
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while creating doctor  : {}", e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id) {
        try {
            logger.info("deleting bill with id {}", id);
            billRepository.deleteById(id);
        }catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while deleting bill with Id {} : {}", id, e.getMessage());
        }
    }

    public Bill updateBill(Long id,  Bill bill) {
        try {
            Optional<Bill> billOptional = billRepository.findById(id);
            if(billOptional.isPresent()) {
                Bill updatedBill = billOptional.get();
                updatedBill.setId(bill.getId());
                updatedBill.setAmount(bill.getAmount());
                billRepository.save(updatedBill);
                return updatedBill;
            }else {
                logger.info("Bill with id {} not found", id);
                return null;
            }
        } catch(Exception e){
            System.out.println("Error messsage:" +  e.getMessage());
            logger.error("An error occured while updating bill with Id {} : {}", id, e.getMessage());
            return null;
        }
    }
}
