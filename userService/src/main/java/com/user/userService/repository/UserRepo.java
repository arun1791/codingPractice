package com.user.userService.repository;

import com.user.userService.dto.UserDto;
import com.user.userService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, String> {


}
