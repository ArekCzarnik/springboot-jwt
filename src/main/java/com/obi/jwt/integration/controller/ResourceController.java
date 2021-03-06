package com.obi.jwt.integration.controller;

import com.obi.jwt.integration.domain.User;
import com.obi.jwt.integration.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/springjwt")
public class ResourceController {
    @Autowired
    private GenericService userService;


    @RequestMapping(value = "/cities", method = RequestMethod.GET)
    public List<String> getCities() {
        List<String> cities = new ArrayList();
        cities.add("test");
        cities.add("test2");
        return cities;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers() {
        return userService.findAllUsers();
    }
}
