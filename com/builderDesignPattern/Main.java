package com.builderDesignPattern;

public class Main {
    public static void main(String[] args) {
        User user =new User.UserBuilder()
                .setEmailId("arunp3593@gmail")
                .setUserId("USER101").
                setUserName("ArunPal").build();
        System.out.println(user.toString());
    }
}
