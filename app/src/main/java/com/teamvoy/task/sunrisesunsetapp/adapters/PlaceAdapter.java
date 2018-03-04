package com.teamvoy.task.sunrisesunsetapp.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.teamvoy.task.sunrisesunsetapp.R;
import com.teamvoy.task.sunrisesunsetapp.models.CurrentPlace;



public class PlaceAdapter extends ArrayAdapter<CurrentPlace> {

//    private Context mContext;

    public PlaceAdapter(@NonNull Context context, int resource) {
        super(context, resource);
//        mContext = context;
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.id.item_result, parent, false);
        }
        CurrentPlace place = getItem(position);

        TextView place_name_view = listItemView.findViewById(R.id.place_name);
        place_name_view.setText(place.getPlaceName());
        TextView place_address_view = listItemView.findViewById(R.id.place_address);
        place_address_view.setText(place.getPlaceAddress());


        return listItemView;


    }
}
