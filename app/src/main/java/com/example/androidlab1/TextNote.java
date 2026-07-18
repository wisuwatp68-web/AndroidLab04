package com.example.androidlab1;

public class TextNote extends Note {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void displayNote() {
        System.out.println("Title : " + getTitle());
        System.out.println("Content : " + getContent());
        System.out.println("Created Date : " + getCreatedDate());
        System.out.println("Text : " + getText());
    }
}