package com.teamvoy.task.sunrisesunsetapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.teamvoy.task.sunrisesunsetapp.R;
import com.teamvoy.task.sunrisesunsetapp.adapters.TabPagerAdapter;
import com.teamvoy.task.sunrisesunsetapp.fragments.PlaceFragment;
import com.teamvoy.task.sunrisesunsetapp.models.CurrentPlace;
import com.teamvoy.task.sunrisesunsetapp.utils.PlaceUtil;

public class MainActivity extends AppCompatActivity /*implements OnClickListener*/ {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Toolbar toolbar;
//    private TextView tv_place_name, tv_place_address;
    private static final int PLACE_PICKER_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new TabPagerAdapter(getSupportFragmentManager(), this));

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        startActivityForResult(PlaceUtil.getIntent(this), PLACE_PICKER_REQUEST);


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PLACE_PICKER_REQUEST && requestCode == RESULT_OK) {
            CurrentPlace place = PlaceUtil.getPlace(this, data);
            PlaceFragment placeFragment = (PlaceFragment) getSupportFragmentManager().findFragmentByTag(PlaceFragment.PLACE_TAG);
            Bundle bundle = new Bundle();
            bundle.putCharSequence("place_name",place.getPlaceName());
            bundle.putCharSequence("place_address",place.getPlaceAddress());
            placeFragment.setBundle(bundle);
//            tv_place_name = findViewById(R.id.place_name);
//            tv_place_name.setText("Current place coordinates: "+place.getPlaceName());
//
//            tv_place_address = findViewById(R.id.place_address);
//            tv_place_address.setText("Place address: "+place.getPlaceAddress());
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_picker) {
            startActivityForResult(PlaceUtil.getIntent(this), PLACE_PICKER_REQUEST);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




}
