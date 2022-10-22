package com.example.bloodBank.controller;

import com.example.bloodBank.entity.Donation;
import com.example.bloodBank.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DonationController {

    @Autowired
    private DonationService donationService;

    @PostMapping("donations")
    public void addDonation(@RequestBody Donation donation){
        donationService.save(donation);
    }

    @GetMapping("donations")
    public List<Donation> getAllDonations(){
        return donationService.getAll();
    }

    @DeleteMapping("donations/{id}")
    public void deleteDonations(@PathVariable Integer id){
        donationService.delete(id);
    }

}