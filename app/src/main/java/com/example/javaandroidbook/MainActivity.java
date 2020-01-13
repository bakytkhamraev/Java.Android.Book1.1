package com.example.javaandroidbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.javaandroidbook.Android.Android_1;
import com.example.javaandroidbook.Java.Java;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startJava(View view) {
        Intent intent=new Intent(this, Java.class);
        startActivity(intent);
    }

    public void startAndroid(View view) {
        Intent intent=new Intent(this, Android_1.class);
        startActivity(intent);
    }
}
