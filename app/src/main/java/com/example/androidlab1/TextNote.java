package com.example.androidlab1;

public class TextNote extends Note {
    private String text;

    public void setText(String text) { this.text = text; }
    public String getText() { return this.text; }

    @Override
    public void displayNote() {
        System.out.println("--- Text Note ---");
        System.out.println("Title: " + getTitle());
        System.out.println("Content: " + getContent());
        System.out.println("Text: " + text);
        if (getOwner() != null) {
            System.out.println("Owner: " + getOwner().getFullName());
        }
    }
}