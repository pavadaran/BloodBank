package com.example.bloodBank.repository;

import com.example.bloodBank.entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, Integer>{
}
