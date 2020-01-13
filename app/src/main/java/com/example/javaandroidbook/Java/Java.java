package com.example.javaandroidbook.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.javaandroidbook.R;

public class Java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
    }

    public void startJavaOne(View view) {

        Intent intent=new Intent(this, Java_1.class);
        startActivity(intent);
    }

    public void startJavaTwo(View view) {

        Intent intent=new Intent(this, Java_2.class);
        startActivity(intent);
    }
}
