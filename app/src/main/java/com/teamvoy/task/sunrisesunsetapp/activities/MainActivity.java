package com.teamvoy.task.sunrisesunsetapp.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.teamvoy.task.sunrisesunsetapp.R;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Button place_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        place_button = findViewById(R.id.place_picker_button);
        viewPager =  findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabs);


//        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
//        viewPager.setAdapter(new RacesPagerAdapter(getSupportFragmentManager(), this));
//
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);

    }
}
