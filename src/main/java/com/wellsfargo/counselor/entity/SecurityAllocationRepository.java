package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.SecurityAllocation;
import org.springframework.data.repository.CrudRepository;

public interface SecurityAllocationRepository extends CrudRepository<SecurityAllocation, Long> {
    // Custom query methods can be added here later
}
