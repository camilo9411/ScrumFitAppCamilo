package com.example.scrumfitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.scrumfitapp.model.DailyAdapter;
import com.example.scrumfitapp.model.ExerciseAdapter;

import java.util.ArrayList;

public class ListRoutine_Daily_Activity extends AppCompatActivity implements View.OnClickListener{

    //Declaration of views
    ListView lvDays;
    Button btnHome, btnListRoutine, btnCreateRoutine, btnProfile;
    DailyAdapter dailyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_routine_daily);

        initialize();
    }

    private void initialize()
    {
        //Initialization of views
        btnHome = findViewById(R.id.btnHome);
        btnListRoutine = findViewById(R.id.btnListRoutine);
        btnCreateRoutine = findViewById(R.id.btnCreateRoutine);
        btnProfile = findViewById(R.id.btnProfile);
        btnHome.setOnClickListener(this);
        btnListRoutine.setOnClickListener(this);
        btnCreateRoutine.setOnClickListener(this);
        btnProfile.setOnClickListener(this);

        lvDays = findViewById(R.id.lvDays);

        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);

        dailyAdapter = new DailyAdapter(this, items);

        lvDays.setAdapter(dailyAdapter);

    }

    @Override
    public void onClick(View view)
    {
        int id = view.getId();
        switch (id)
        {
            case R.id.btnProfile:
                break;
            case R.id.btnHome:
                break;
            case R.id.btnListRoutine:
                break;
            case R.id.btnCreateRoutine:
                break;

        }
    }
}