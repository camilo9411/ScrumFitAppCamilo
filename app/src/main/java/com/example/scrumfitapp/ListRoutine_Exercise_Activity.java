package com.example.scrumfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ListRoutine_Exercise_Activity extends AppCompatActivity implements View.OnClickListener{

    //Declaration of views
    EditText edSetOneReps, edSetTwoReps, edSetThreeReps, edSetOneWeight, edSetTwoWeight, edSetThreeWeight;
    Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_routine_exercise);
        initialize();
    }

    private void initialize()
    {
        //Initialization of views
        edSetOneReps = findViewById(R.id.edSetOneReps);
        edSetTwoReps = findViewById(R.id.edSetTwoReps);
        edSetThreeReps = findViewById(R.id.edSetThreeReps);
        edSetOneWeight = findViewById(R.id.edSetOneWeight);
        edSetTwoWeight = findViewById(R.id.edSetTwoWeight);
        edSetThreeWeight = findViewById(R.id.edSetThreeWeight);
        btnDone = findViewById(R.id.btnDone);

        btnDone.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();
        switch (id)
        {
            case R.id.btnDone:
                break;
        }
    }
}