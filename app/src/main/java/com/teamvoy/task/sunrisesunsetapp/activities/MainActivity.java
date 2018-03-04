package com.teamvoy.task.sunrisesunsetapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.teamvoy.task.sunrisesunsetapp.R;
import com.teamvoy.task.sunrisesunsetapp.utils.PlaceUtil;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Button place_button;

    private static final int PLACE_PICKER_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        place_button = findViewById(R.id.place_picker_button);
        place_button.setOnClickListener(this);

        viewPager = findViewById(R.id.view_pager);
//        viewPager.setAdapter();

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


    }

    @Override
    public void onClick(View view) {
        startActivityForResult(PlaceUtil.getIntent(this), PLACE_PICKER_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PLACE_PICKER_REQUEST && requestCode == RESULT_OK) {

        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
