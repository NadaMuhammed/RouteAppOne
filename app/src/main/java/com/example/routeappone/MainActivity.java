package com.example.routeappone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    AppCompatButton androidAppCompatButton;
    AppCompatButton iosAppCompatButton;
    AppCompatButton fullStackAppCompatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        LayoutInflater.from(this).inflate(R.layout.activity_main, null)
        androidAppCompatButton = findViewById(R.id.androidBtn);
        iosAppCompatButton = findViewById(R.id.iosBtn);
        fullStackAppCompatButton = findViewById(R.id.fullStackBtn);

        androidAppCompatButton.setOnClickListener(this);
        iosAppCompatButton.setOnClickListener(this);
        fullStackAppCompatButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.androidBtn) {
            startCourseActivity("android");
        } else if (view.getId() == R.id.iosBtn) {
            startCourseActivity("ios");
        } else {
            startCourseActivity("fullstack");
        }
    }

    private void startCourseActivity(String courseName) {
        Intent intent = new Intent(this, CourseActivity.class);
        intent.putExtra("course", courseName);
        startActivity(intent);
    }
}