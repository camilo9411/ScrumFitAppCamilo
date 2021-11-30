package com.example.scrumfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Log_Register_Activity extends AppCompatActivity implements View.OnClickListener{

    //Declaration of Views
    EditText edUsername, edPassword, edEmail, edHeight, edWeight, edBirthday;
    Button btnRegister;
    TextView btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_register);
        initialize();
    }

    private void initialize()
    {
        //Initialization of views
        edUsername = findViewById(R.id.edUsername);
        edPassword = findViewById(R.id.edPassword);
        edEmail = findViewById(R.id.edEmail);
        edHeight = findViewById(R.id.edHeight);
        edWeight = findViewById(R.id.edWeight);
        edBirthday = findViewById(R.id.edBirthday);
        btnRegister = findViewById(R.id.btnRegister);
        btnSignIn = findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(this);
        btnRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();
        switch (id)
        {
            case R.id.btnSignIn:
                break;
            case R.id.btnRegister:
                break;

        }

    }
}