package com.example.android.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BirthdayGreetingActivity extends AppCompatActivity {

    companion object{
        const String=
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        String name= getIntent().getStringExtra("name")
    }
}