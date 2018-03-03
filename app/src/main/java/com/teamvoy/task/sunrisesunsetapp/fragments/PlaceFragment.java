package com.teamvoy.task.sunrisesunsetapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.teamvoy.task.sunrisesunsetapp.R;


public class PlaceFragment extends Fragment {
    private TextView placeNameTV, placeAddress;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.place_layout,container,false);
    }
}
