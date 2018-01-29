package com.obi.jwt.integration.service;

import com.obi.jwt.integration.domain.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

}
