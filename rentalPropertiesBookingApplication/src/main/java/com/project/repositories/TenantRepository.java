package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.models.Tenant;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
