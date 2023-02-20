package com.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.models.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {
	
	List<Property> findByAddressContainingIgnoreCaseAndBedroomsGreaterThanEqualAndPriceLessThanEqual(String address,int bedrooms, double price);
	
}
