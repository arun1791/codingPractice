package com.user.userService.service;

import com.user.userService.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto addUser(UserDto userDto);
    UserDto updateUser( String UUID);
    UserDto getUserById( String UUID);
    UserDto deleteUserById( String UUID);
    List<UserDto> getAllUsers();

}
