package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.models.Landlord;

public interface LandlordRepository extends JpaRepository<Landlord, Long> {
}