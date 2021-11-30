package com.example.scrumfitapp.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.scrumfitapp.R;

import java.util.ArrayList;

public class ExerciseAdapter extends BaseAdapter {


    private Context context;
    ArrayList<Integer> items;


    public ExerciseAdapter(Context context, ArrayList<Integer> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View oneExercise;

        LayoutInflater inflater = LayoutInflater.from(context);
        oneExercise = inflater.inflate(R.layout.item_exercise, viewGroup, false);

        return oneExercise;
    }
}
