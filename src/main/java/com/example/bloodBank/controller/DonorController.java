package com.example.bloodBank.controller;

import com.example.bloodBank.entity.Donor;
import com.example.bloodBank.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DonorController {

    @Autowired
    private DonorService donorService;

    @PostMapping("donors")
    public void addDonor(@RequestBody Donor donor){
        donorService.save(donor);
    }

    @GetMapping("donors")
    public List<Donor> getAllDonors(){
        return donorService.getAll();
    }

    @GetMapping("donors/{id}")
    public Donor getDonor(@PathVariable Integer id){
        return donorService.getDonor(id);
    }

}
