package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name2 = name.getText().toString();
                int age2 = Integer.parseInt(age.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name2", name2);
                intent.putExtra("age2", age2);
                startActivity(intent);

                if (TextUtils.isEmpty(name.getText().toString())){
                    name.setError("أكتب الإسم من فضلك!!");
                    return;

                }

                else if ();
                if (TextUtils.isEmpty(age.getText().toString())){
                    age.setError("أكتب العمر من فضلك!!");
                    return;
                }

                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();oast




            }
        });




    }

}