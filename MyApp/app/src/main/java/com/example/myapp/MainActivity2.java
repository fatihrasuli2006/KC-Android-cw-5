package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView nameTV = findViewById(R.id.textView2);
        TextView ageTV = findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();

        String name3 = bundle.getString("name2");
        nameTV.setText(name3);

        int age3 = bundle.getInt("age2");
        ageTV.setText(String.valueOf(age3));

    }
}