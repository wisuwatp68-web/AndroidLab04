package com.example.androidlab1;

public class MainUser {

    public static void main(String[] args) {

        User user1 = new StudentUser();

        user1.setUsername("student01");
        user1.setPassword("1234");

        user1.login();
        user1.showRole();
        user1.logout();

        System.out.println();

        User user2 = new AdminUser();

        user2.setUsername("admin");
        user2.setPassword("0000");

        user2.login();
        user2.showRole();
        user2.logout();
    }
}