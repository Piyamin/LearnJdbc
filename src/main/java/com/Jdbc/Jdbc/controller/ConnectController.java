package com.Jdbc.Jdbc.controller;

import java.util.List;
import java.util.Map;

import com.Jdbc.Jdbc.service.ConnectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/connect")
public class ConnectController {
    @Autowired
     ConnectService connectService;

     @GetMapping("/user/{userId}")
    public List<Map<String, Object>> findByUserId(@PathVariable Integer userId) {
        return connectService.findUserProfileAccount(userId);
    }
}
