package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.Security;
import org.springframework.data.repository.CrudRepository;

public interface SecurityRepository extends CrudRepository<Security, Long> {
    // You can add custom query methods here if needed in the future
}
