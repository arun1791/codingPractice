package com.user.userService.service.impl;

import com.user.userService.dto.UserDto;
import com.user.userService.entity.User;
import com.user.userService.repository.UserRepo;
import com.user.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDto addUser(UserDto userDto) {
        //call builde pattern
        User user= User.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .about(userDto.getAbout())
                .build();
        User save = userRepo.save(user);
        return mapToDto(save);

    }

    @Override
    public UserDto updateUser(String UUID) {
        return null;
    }

    @Override
    public UserDto getUserById(String UUID) {
        return null;
    }

    @Override
    public UserDto deleteUserById(String UUID) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepo.findAll()
                .stream()
                .map(this::mapToDto)
                .toList();
    }

    private UserDto mapToDto(User user) {
        if (user == null) return null;
        UserDto dto = new UserDto();
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setAbout(user.getAbout());
        return dto;
    }
}
