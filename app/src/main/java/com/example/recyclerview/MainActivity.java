package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCity;

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

        initGUI();
    }

    private void initGUI() {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(
                "https://randomuser.me/api/portraits/men/1.jpg",
                "Nguyen Van An",
                "0901234567"
        ));

        studentList.add(new Student(
                "https://randomuser.me/api/portraits/women/2.jpg",
                "Tran Thi Bich",
                "0912345678"
        ));

        studentList.add(new Student(
                "https://randomuser.me/api/portraits/men/3.jpg",
                "Le Minh Duc",
                "0923456789"
        ));

        studentList.add(new Student(
                "https://randomuser.me/api/portraits/women/4.jpg",
                "Pham Thi Hoa",
                "0934567890"
        ));

        studentList.add(new Student(
                "https://randomuser.me/api/portraits/men/5.jpg",
                "Hoang Gia Huy",
                "0945678901"
        ));

        studentList.add(new Student(
                "https://randomuser.me/api/portraits/women/6.jpg",
                "Do Thi Lan",
                "0956789012"
        ));

        studentList.add(new Student(
                "https://randomuser.me/api/portraits/men/7.jpg",
                "Bui Tuan Kiet",
                "0967890123"
        ));

        studentList.add(new Student(
                "https://randomuser.me/api/portraits/women/8.jpg",
                "Dang Thu Trang",
                "0978901234"
        ));

        studentList.add(new Student(
                "https://randomuser.me/api/portraits/men/9.jpg",
                "Vu Quang Minh",
                "0989012345"
        ));

        studentList.add(new Student(
                "https://randomuser.me/api/portraits/women/10.jpg",
                "Nguyen Ngoc Anh",
                "0990123456"
        ));

        rvCity = findViewById(R.id.rv_city);
        rvCity.setLayoutManager(new LinearLayoutManager(this));
        StudentAdapter adapter = new StudentAdapter(this, studentList, new StudentAdapter.ClickHandler() {
            @Override
            public void clickItem(Student student) {
                // Xử lý sự kiện click item ở đây
            }
        });
        rvCity.setAdapter(adapter);
    }
}