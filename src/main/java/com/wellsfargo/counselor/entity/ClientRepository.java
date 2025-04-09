package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    // Add custom methods if needed, e.g., List<Client> findByAdvisorId(Long advisorId);
}
