package com.obi.jwt.integration.repository;

import com.obi.jwt.integration.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
