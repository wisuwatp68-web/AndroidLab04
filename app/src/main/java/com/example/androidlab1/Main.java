package com.example.androidlab1;

public class Main {

    public static void main(String[] args) {

        TextNote note1 = new TextNote();

        note1.setTitle("Java");
        note1.setContent("OOP");
        note1.setCreatedDate("10/07/2026");

        note1.setText("Study Java");

        note1.displayNote();

        System.out.println();

        CheckListNote note2 = new CheckListNote();

        note2.setTitle("Homework");
        note2.setContent("OOP Assignment");
        note2.setCreatedDate("10/07/2026");

        note2.setChecked(true);

        note2.displayNote();

    }
}