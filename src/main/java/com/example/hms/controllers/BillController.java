package com.example.hms.controllers;

import com.example.hms.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @GetMapping
    public List<Bill> getAllBills() {
        System.out.println("Getting all bills");
        return null;
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        System.out.println("Creating a new bill");
        return null;
    }

    @GetMapping("/id")
    public Bill getBillById(@PathVariable Long id) {
        System.out.println("Getting a bill with id " + id);
        return null;
    }

    @DeleteMapping("/id")
    public void deleteBillById(@PathVariable Long id) {
        System.out.println("Deleting a bill with id " + id);
    }

    @PutMapping("/id")
    public void updateBillById(@RequestBody Bill bill) {
        System.out.println("Updating a bill with id " + bill.getId());
    }
}
