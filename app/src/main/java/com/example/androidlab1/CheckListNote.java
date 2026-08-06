package com.example.androidlab1;

public class CheckListNote extends Note {
    private boolean checked;

    public void setChecked(boolean checked) { this.checked = checked; }
    public boolean isChecked() { return checked; }

    @Override
    public void displayNote() {
        System.out.println("--- Checklist Note ---");
        System.out.println("Title: " + getTitle());
        System.out.println("Content: " + getContent());
        System.out.println("Checked: " + checked);
        if (getOwner() != null) {
            System.out.println("Owner: " + getOwner().getFullName());
        }
    }
}