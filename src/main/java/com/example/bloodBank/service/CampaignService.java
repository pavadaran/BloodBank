package com.example.bloodBank.service;

import com.example.bloodBank.entity.Campaign;
import com.example.bloodBank.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CampaignService{

    @Autowired
    private CampaignRepository campaignRepository;

    public void save(Campaign campaign){
        campaignRepository.save(campaign);
    }

    public List<Campaign> getAll(){
        return campaignRepository.findAll();
    }

    public void delete(Integer id){
        campaignRepository.deleteById(id);
    }

}