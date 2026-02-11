package com.user.userService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_info")
public class User {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    String UUID;
    String name;
    String email;
    String about;
    long mobile;
}
