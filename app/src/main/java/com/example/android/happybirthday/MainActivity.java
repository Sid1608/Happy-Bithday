package com.example.android.happybirthday;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void createBirthdayCard(View view) {
        String name = "Siddharth Akar";
        //name=nameInput.editableText.toString();
        Toast.makeText(this, "name is $name",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, BirthdayGreetingActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);

    }
}