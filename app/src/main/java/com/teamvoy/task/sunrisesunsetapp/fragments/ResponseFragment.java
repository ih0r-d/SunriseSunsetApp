package com.teamvoy.task.sunrisesunsetapp.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.teamvoy.task.sunrisesunsetapp.R;


public class ResponseFragment extends Fragment {
    private TextView sunriseTV, sunsetTV, dayLengthTV;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.response_list, container, false);

    }


}
