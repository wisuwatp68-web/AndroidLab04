package com.example.androidlab1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1. เพิ่มตัวแปร currentUser แบบ static ตามที่อาจารย์สั่งใน Class Diagram
    public static User currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. กำหนดค่าเริ่มต้นให้ User (ถ้ายังไม่มี)
        if (currentUser == null) {
            currentUser = new StudentUser();
            currentUser.setFullName("นักศึกษา ทดสอบ"); // ตั้งชื่อสมมติให้ User
        }

        Button btnGoToAddNote = findViewById(R.id.btnGoToAddNote);

        btnGoToAddNote.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddNoteActivity.class);
            startActivity(intent);
        });
    }
}