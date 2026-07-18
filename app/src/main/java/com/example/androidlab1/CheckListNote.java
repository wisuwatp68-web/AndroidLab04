package com.example.androidlab1;

public class CheckListNote extends Note {

    private boolean checked;

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public void displayNote() {
        System.out.println("Checklist Note");
        System.out.println(getTitle());
        System.out.println("Checked : " + checked);
    }
}