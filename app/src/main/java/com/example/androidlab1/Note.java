package com.example.androidlab1;

public abstract class Note {
    private String title;
    private String content;
    private String createdDate;
    private User owner;

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return this.title; }

    public void setContent(String content) { this.content = content; }
    public String getContent() { return this.content; }

    public void setCreatedDate(String date) { this.createdDate = date; }
    public String getCreatedDate() { return this.createdDate; }

    public void setOwner(User owner) { this.owner = owner; }
    public User getOwner() { return this.owner; }

    public abstract void displayNote();
}