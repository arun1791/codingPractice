package com.user.userService.controller;

import com.user.userService.dto.UserDto;
import com.user.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    ResponseEntity<UserDto> addUser( @RequestBody UserDto userDto) {
        UserDto savedUser = userService.addUser(userDto);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping
    ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

}
