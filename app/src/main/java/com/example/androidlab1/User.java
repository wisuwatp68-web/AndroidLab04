package com.example.androidlab1;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private String userID;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private List<Note> notes = new ArrayList<>();

    // Getters and Setters
    public String getUserID() { return userID; }
    public void setUserID(String userID) { this.userID = userID; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // --- เมธอดตาม Class Diagram (ที่ MainUser.java เรียกใช้) ---
    public void login() {
        System.out.println(username + " เข้าสู่ระบบสำเร็จ");
    }

    public void logout() {
        System.out.println(username + " ออกจากระบบสำเร็จ");
    }

    public void editProfile() {
        System.out.println("แก้ไขข้อมูลส่วนตัวสำเร็จ");
    }

    // --- เมธอดจัดการ Note ---
    public void addNote(Note note) {
        this.notes.add(note);
    }

    public void deleteNote(Note note) {
        this.notes.remove(note);
    }

    public List<Note> getAllNote() {
        return this.notes;
    }

    public abstract void showRole();
}