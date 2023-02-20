package com.project.controller;

@RestController
@RequestMapping("/api/tenants")
public class TenantController {

    @Autowired
    private TenantService tenantService;

    @GetMapping
    public List<Tenant> getAllTenants() {
       
        return tenantService.getAllTenants();
    }

    @GetMapping("/{id}")
    public Tenant getTenantById(@PathVariable("id") Long id) {
       
        return tenantService.getTenantById(id);
    }

    @PostMapping
    public Tenant createTenant(@RequestBody Tenant tenant) {
        
        return tenantService.createTenant(tenant);
    }

    @PutMapping("/{id}")
    public Tenant updateTenant(@PathVariable("id") Long id, @RequestBody Tenant tenant) {
        
        return tenantService.updateTenant(id, tenant);
    }

    @DeleteMapping("/{id}")
    public void deleteTenant(@PathVariable("id") Long id) {
        
        tenantService.deleteTenant(id);
    }

    @GetMapping("/{id}/properties")
    public List<Property> getPropertiesByTenantId(@PathVariable("id") Long id) {
        
        return tenantService.getPropertiesByTenantId(id);
    }
}

