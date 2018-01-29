package com.obi.jwt.integration.repository;

import com.obi.jwt.integration.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
