package com.example.bloodBank.service;

import com.example.bloodBank.entity.Donation;
import com.example.bloodBank.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DonationService{

    @Autowired
    private DonationRepository donationRepository;

    public void save(Donation campaign){
        donationRepository.save(campaign);
    }

    public List<Donation> getAll(){
        return donationRepository.findAll();
    }

    public void delete(Integer id){
        donationRepository.deleteById(id);
    }

}
