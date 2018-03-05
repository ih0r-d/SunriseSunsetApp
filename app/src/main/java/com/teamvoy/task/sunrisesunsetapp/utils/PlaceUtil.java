package com.teamvoy.task.sunrisesunsetapp.utils;


import android.app.Activity;
import android.content.Intent;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.teamvoy.task.sunrisesunsetapp.models.CurrentPlace;

public class PlaceUtil {

    public static Intent getIntent(Activity activity) {
        Intent intent = null;
        PlacePicker.IntentBuilder intentBuilder = new PlacePicker.IntentBuilder();
        if (intent == null) {
            try {
                intent = intentBuilder.build(activity);
            } catch (GooglePlayServicesRepairableException | GooglePlayServicesNotAvailableException e) {
                e.printStackTrace();
            }
        }
        return intent;
    }

    public static CurrentPlace getPlace(Activity activity,Intent data) {

        final Place place = PlacePicker.getPlace(activity, data);
        final CharSequence name = place.getName();
        final CharSequence address = place.getAddress();
        double latitude = place.getLatLng().latitude;
        double longitude = place.getLatLng().longitude;

        CurrentPlace currentPlace = new CurrentPlace();
        currentPlace.setPlaceName(name);
        currentPlace.setPlaceAddress(address);
        currentPlace.setLatitude(latitude);
        currentPlace.setLongitude(longitude);
        return currentPlace;
    }
}
