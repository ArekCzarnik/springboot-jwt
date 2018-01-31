package com.obi.jwt.integration.service;

import com.obi.jwt.integration.domain.User;

import java.util.List;

public interface GenericService {

    List<User> findAllUsers();

}
