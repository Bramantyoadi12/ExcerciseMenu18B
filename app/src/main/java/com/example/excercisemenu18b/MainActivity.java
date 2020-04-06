package com.example.excercisemenu18b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText Nama, Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.btnok);
        Nama = findViewById(R.id.editUN);
        Pass = findViewById(R.id.editPass);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                if (Pass.getText().toString().equals("123") && Nama.getText().toString().equals("admin")) {
                    Intent intent = new Intent(MainActivity.this, ListBangun.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

