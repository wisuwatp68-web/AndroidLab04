package com.example.androidlab1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Note note1 = new TextNote();
        note1.setTitle("OOP");
        note1.setContent("Class and Object");
        note1.setCreatedDate("16/07/2026");

        note1.displayNote();


        User user = new StudentUser();

        user.setUserID("001");
        user.setUsername("admin");
        user.setPassword("1234");
        user.setFullName("Wisuwat");
        user.setEmail("abc@gmail.com");

        System.out.println(user.getUserID());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getFullName());
        System.out.println(user.getEmail());

        user.login();
        user.editProfile();
        user.showRole();
        user.logout();
    }
}