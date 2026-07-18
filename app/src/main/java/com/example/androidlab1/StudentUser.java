package com.example.androidlab1;

public class StudentUser extends User {

    @Override
    public void showRole() {
        System.out.println("Role : Student");
        System.out.println("ID : " + getUserID());
        System.out.println("Username : " + getUsername());
        System.out.println("Password : " + getPassword());
        System.out.println("Full Name : " + getFullName());
        System.out.println("Email : " + getEmail());
    }
}