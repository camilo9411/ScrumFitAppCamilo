package com.example.scrumfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Log_SignIn_Acitity extends AppCompatActivity implements View.OnClickListener {

    //Declaration of Views
    EditText edUsername, edPassword;
    Button btnSignIn;
    TextView btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_sign_in);
        initialize();
    }

    private void initialize()
    {
        //Initialization of views
        edUsername = findViewById(R.id.edUsername);
        edPassword = findViewById(R.id.edPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
        btnSignUp = findViewById(R.id.btnSignUp);
    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();
        switch (id)
        {
            case R.id.btnSignIn:
                break;
            case R.id.btnSignUp:
                break;
        }

    }
}