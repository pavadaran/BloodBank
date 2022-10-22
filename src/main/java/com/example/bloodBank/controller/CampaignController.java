package com.example.bloodBank.controller;

import com.example.bloodBank.entity.Campaign;
import com.example.bloodBank.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    @PostMapping("campaigns")
    public void addCampaign(@RequestBody Campaign campaign){
        campaignService.save(campaign);
    }

    @GetMapping("campaigns")
    public List<Campaign> getAllCampaigns(){
        return campaignService.getAll();
    }

    @DeleteMapping("campaigns/{id}")
    public void deleteCampaign(@PathVariable Integer id){
        campaignService.delete(id);
    }

}
