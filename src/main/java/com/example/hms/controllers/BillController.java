package com.example.hms.controllers;

import com.example.hms.models.Bill;
import com.example.hms.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public List<Bill> getAllBills() {
        System.out.println("Getting all bills");
        return billService.getAllBills();
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        System.out.println("Creating a new bill");
        return billService.createBill(bill);
    }

    @GetMapping("/id")
    public Bill getBillById(@PathVariable Long id) {
        System.out.println("Getting a bill with id " + id);
        return billService.getBillById(id);
    }

    @DeleteMapping("/id")
    public void deleteBillById(@PathVariable Long id) {
        System.out.println("Deleting a bill with id " + id);
        billService.deleteBill(id);
    }

    @PutMapping("/id")
    public void updateBillById(@PathVariable Long id) {
        System.out.println("Updating a bill with id " + id);
        billService.updateBill(id);
    }
}
