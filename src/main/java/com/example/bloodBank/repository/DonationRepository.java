package com.example.bloodBank.repository;

import com.example.bloodBank.entity.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Integer>{
}
