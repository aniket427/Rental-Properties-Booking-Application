package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.models.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}