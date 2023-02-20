package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getAllBookings() {
        
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable("id") Long id) {
        
        return bookingService.getBookingById(id);
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        
        return bookingService.createBooking(booking);
    }

    @PutMapping("/{id}")
    public Booking updateBooking(@PathVariable("id") Long id, @RequestBody Booking booking) {
        
        return bookingService.updateBooking(id, booking);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable("id") Long id) {
       
        bookingService.deleteBooking(id);
    }

    @GetMapping("/{id}/tenant")
    public Tenant getTenantByBookingId(@PathVariable("id") Long id) {
       
        return bookingService.getTenantByBookingId(id);
    }

    @GetMapping("/{id}/property")
    public Property getPropertyByBookingId(@PathVariable("id") Long id) {
       
        return bookingService.getPropertyByBookingId(id);
    }

    @GetMapping("/{id}/landlord")
    public Landlord getLandlordByBookingId(@PathVariable("id") Long id) {
        
        return bookingService.getLandlordByBookingId(id);
    }
}
