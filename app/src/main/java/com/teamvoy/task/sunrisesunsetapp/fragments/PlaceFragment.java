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
    private TextView place_name, place_address;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.place_fragment, container, false);

        place_name = view.findViewById(R.id.place_name);
        place_address = view.findViewById(R.id.place_address);


        return view;
    }


}
