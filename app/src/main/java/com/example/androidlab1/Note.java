package com.example.androidlab1;

public abstract class Note {

    // Attributes
    private String title;
    private String content;
    private String createdDate;

    // Getter และ Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    // Abstract Method
    public abstract void displayNote();
}