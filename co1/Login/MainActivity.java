package com.example.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity{
    EditText username,password,textView2;
    Button button;
    String c_Username="admin";
    String c_password="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("username") && password.getText().toString().equals("password").){
                    Toast toast=Toast.makeText(getApplicationContext(),"Login succesfull",Toast.LENGTH_SHORT).show();


                }else if (username.getText().toString().equals(c_Username)){
                    if(password.getText().toString().equals(c_password))
                }else {
                    Toast.makeText(MainActivity.this,"invalid username or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
        {

        });







        }

    }