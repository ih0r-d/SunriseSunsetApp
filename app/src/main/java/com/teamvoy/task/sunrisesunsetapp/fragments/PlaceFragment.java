package com.teamvoy.task.sunrisesunsetapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.teamvoy.task.sunrisesunsetapp.R;


public class PlaceFragment extends Fragment /*implements AdapterView.OnItemClickListener*/ {
    private static final int PLACE_PICKER_REQUEST = 1;
    public static final String PLACE_TAG = "place_tag";
    private Bundle bundle;

    private TextView tv_place_name, tv_place_address;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View placeView = inflater.inflate(R.layout.place_item, container, false);
//        if (savedInstanceState == null) {
//            savedInstanceState = getArguments();
//        }
        tv_place_name = placeView.findViewById(R.id.place_name);
        tv_place_address = placeView.findViewById(R.id.place_address);

        if (bundle != null) {
            CharSequence place_name = bundle.getCharSequence("place_name");
            tv_place_name.setText("Current place coordinates: "+place_name);
            CharSequence place_address = bundle.getCharSequence("place_address");
            tv_place_address.setText("Place address: "+place_address);
//            int i = bundle.getInt(key, defaulValue);
        }
//        return super.onCreateView(inflater, container, savedInstanceState);
        return placeView;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    //    private PlaceAdapter mPlaceAdapter;



//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == PLACE_PICKER_REQUEST && requestCode == RESULT_OK) {
//            CurrentPlace place = PlaceUtil.getPlace(getActivity(), data);
//            tv_place_name = getView().findViewById(R.id.place_name);
//            tv_place_name.setText(place.getPlaceName());
//
//            tv_place_address = getView().findViewById(R.id.place_address);
//            tv_place_address.setText(place.getPlaceAddress());
//
//
//        } else {
//            super.onActivityResult(requestCode, resultCode, data);
//        }
//    }

//
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//
//        mPlaceAdapter = new PlaceAdapter(getActivity(), new ArrayList<CurrentPlace>());
//        View view = inflater.inflate(R.layout.place_item, container, false);
//
////        final PlaceAdapter placeAdapter = mPlaceAdapter;
////        listView = view.findViewById(R.id.result_list);
////        listView.setAdapter(placeAdapter);
////        listView.setOnItemClickListener(this);
////        CurrentPlace place = new CurrentPlace();
//
//
//        return view;
//    }

//
//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//        CurrentPlace item = mPlaceAdapter.getItem(position);
//    }

}
