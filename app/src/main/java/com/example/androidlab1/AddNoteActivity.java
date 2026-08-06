package com.example.androidlab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {

    private EditText etTitle;
    private EditText etContent;
    private Button btnAddNote;
    private Button btnBack; // 👈 1. เพิ่มตัวแปรสำหรับปุ่มย้อนกลับ
    private TextView tvShowNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        etTitle = findViewById(R.id.etTitle);
        etContent = findViewById(R.id.etContent);
        btnAddNote = findViewById(R.id.btnSaveNote);
        tvShowNote = findViewById(R.id.tvShowNote);
        btnBack = findViewById(R.id.btnBack); // 👈 2. ผูก ID ปุ่มย้อนกลับ (ตรวจสอบ android:id ในไฟล์ activity_add_note.xml ให้ตรงกัน)

        // ดึงรายการโน้ตที่มีอยู่มาแสดงผลทันทีเมื่อเปิดหน้าจอ
        updateNoteDisplay();

        // Event-driven: เพิ่มข้อมูลโน้ต (Data Processing Event)
        btnAddNote.setOnClickListener(v -> {
            String title = etTitle.getText().toString().trim();
            String content = etContent.getText().toString().trim();

            if (title.isEmpty() || content.isEmpty()) {
                Toast.makeText(this, "กรุณากรอกชื่อเรื่องและเนื้อหา", Toast.LENGTH_SHORT).show();
                return;
            }

            // 1. สร้างวัตถุ TextNote
            TextNote note = new TextNote();
            note.setTitle(title);
            note.setContent(content);
            note.setOwner(MainActivity.currentUser);

            // 2. เพิ่มเข้าสู่คลาส User
            MainActivity.currentUser.addNote(note);

            // 3. อัปเดตข้อความบน TextView ให้แสดงรายละเอียดโน้ตทันที
            updateNoteDisplay();

            // เคลียร์ช่องกรอกข้อมูล
            etTitle.setText("");
            etContent.setText("");

            Toast.makeText(this, "บันทึกโน้ตสำเร็จ!", Toast.LENGTH_SHORT).show();
        });

        // 👈 3. เพิ่ม Event Listener สำหรับปุ่มย้อนกลับหน้าแรก
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> {
                finish(); // คำสั่งทำลาย Activity ปัจจุบัน เพื่อกลับไปยัง MainActivity
            });
        }
    }

    // เมธอดดึงข้อมูลโน้ตมาต่อเป็นข้อความแสดงผลบน showNote (TextView)
    private void updateNoteDisplay() {
        if (tvShowNote == null) return;

        if (MainActivity.currentUser == null || MainActivity.currentUser.getAllNote().isEmpty()) {
            tvShowNote.setText("ยังไม่มีโน้ตที่บันทึกไว้");
            return;
        }

        StringBuilder builder = new StringBuilder();
        builder.append("รายการโน้ตของ ").append(MainActivity.currentUser.getFullName()).append(":\n");
        builder.append("===========================\n");

        for (Note note : MainActivity.currentUser.getAllNote()) {
            builder.append("📌 หัวข้อ: ").append(note.getTitle()).append("\n");
            builder.append("เนื้อหา: ").append(note.getContent()).append("\n");
            builder.append("เจ้าของ: ").append(note.getOwner() != null ? note.getOwner().getFullName() : "ไม่ระบุ").append("\n");
            builder.append("-------------------------------------------\n");
        }

        tvShowNote.setText(builder.toString());
    }
}