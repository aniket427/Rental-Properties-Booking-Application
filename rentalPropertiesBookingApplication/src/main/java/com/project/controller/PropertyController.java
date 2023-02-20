package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Booking;
import com.project.models.Property;
import com.project.repositories.BookingRepository;
import com.project.repositories.PropertyRepository;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public List<Property> getAllProperties() {
       
        return propertyService.getAllProperties();
    }

    @GetMapping("/{id}")
    public Property getPropertyById(@PathVariable("id") Long id) {
       
        return propertyService.getPropertyById(id);
    }

    @PostMapping
    public Property createProperty(@RequestBody Property property) {
       
        return propertyService.createProperty(property);
    }

    @PutMapping("/{id}")
    public Property updateProperty(@PathVariable("id") Long id, @RequestBody Property property) {
        
        return propertyService.updateProperty(id, property);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable("id") Long id) {
       
        propertyService.deleteProperty(id);
    }

    @GetMapping("/search")
    public List<Property> searchProperties(@RequestParam(value = "location", required = false) String location,
                                            @RequestParam(value = "price", required = false) Double price,
                                            @RequestParam(value = "bedrooms", required = false) Integer bedrooms) {
        
        return propertyService.searchProperties(location, price, bedrooms);
    }
}
