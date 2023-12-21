package com.example.routeappone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    AppCompatButton androidAppCompatButton;
    AppCompatButton iosAppCompatButton;
    AppCompatButton fullStackAppCompatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidAppCompatButton = findViewById(R.id.androidBtn);
        iosAppCompatButton = findViewById(R.id.iosBtn);
        fullStackAppCompatButton = findViewById(R.id.fullStackBtn);

        androidAppCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AndroidActivity.class);
                startActivity(intent);
            }
        });

        iosAppCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IosActivity.class);
                startActivity(intent);
            }
        });

        fullStackAppCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FullStackActivity.class);
                startActivity(intent);
            }
        });
    }
}