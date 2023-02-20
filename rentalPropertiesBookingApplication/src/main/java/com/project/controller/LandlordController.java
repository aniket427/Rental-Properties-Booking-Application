package com.project.controller;

@RestController
@RequestMapping("/api/landlords")
public class LandlordController {

    @Autowired
    private LandlordService landlordService;

    @GetMapping
    public List<Landlord> getAllLandlords() {
       
        return landlordService.getAllLandlords();
    }

    @GetMapping("/{id}")
    public Landlord getLandlordById(@PathVariable("id") Long id) {
       
        return landlordService.getLandlordById(id);
    }

    @PostMapping
    public Landlord createLandlord(@RequestBody Landlord landlord) {
        
        return landlordService.createLandlord(landlord);
    }

    @PutMapping("/{id}")
    public Landlord updateLandlord(@PathVariable("id") Long id, @RequestBody Landlord landlord) {
        
        return landlordService.updateLandlord(id, landlord);
    }

    @DeleteMapping("/{id}")
    public void deleteLandlord(@PathVariable("id") Long id) {
        
        landlordService.deleteLandlord(id);
    }

    @GetMapping("/{id}/properties")
    public List<Property> getPropertiesByLandlordId(@PathVariable("id") Long id) {
        
        return landlordService.getPropertiesByLandlordId(id);
    }

    @GetMapping("/{id}/applications")
    public List<TenantApplication> getApplicationsByLandlordId(@PathVariable("id") Long id) {
        
        return landlordService.getApplicationsByLandlordId(id);
    }

    @PutMapping("/{landlordId}/applications/{applicationId}")
    public TenantApplication updateApplicationStatus(@PathVariable("landlordId") Long landlordId,
                                                      @PathVariable("applicationId") Long applicationId,
                                                      @RequestBody TenantApplicationStatus status) {
        
        return landlordService.updateApplicationStatus(landlordId, applicationId, status);
    }
}

