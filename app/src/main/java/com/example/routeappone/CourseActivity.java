package com.example.routeappone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseActivity extends AppCompatActivity {
    ImageView courseImage;
    TextView courseContentTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        courseImage = findViewById(R.id.courseImage);
        courseContentTv = findViewById(R.id.courseContent);

        String course = getIntent().getStringExtra(Constants.COURSE);

        if (Constants.ANDROID.equals(course)) {
            courseImage.setImageResource(R.drawable.android);
            courseContentTv.setText(R.string.android_contents);
        } else if (Constants.IOS.equals(course)) {
            courseImage.setImageDrawable(getDrawable(R.drawable.ios));
            courseContentTv.setText(R.string.ios_contents);
        } else if (Constants.FULLSTACK.equals(course)) {
            courseImage.setImageDrawable(getDrawable(R.drawable.android));
            courseContentTv.setText(R.string.full_stack_contents);
        }
    }
}