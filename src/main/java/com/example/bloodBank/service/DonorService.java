package com.example.bloodBank.service;

import com.example.bloodBank.entity.Donor;
import com.example.bloodBank.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DonorService{

    @Autowired
    private DonorRepository donorRepository;

    public void save(Donor donor){
        donorRepository.save(donor);
    }

    public List<Donor> getAll(){
        return donorRepository.findAll();
    }

    public Donor getDonor(Integer id){
        return donorRepository.findById(id).get();
    }

}