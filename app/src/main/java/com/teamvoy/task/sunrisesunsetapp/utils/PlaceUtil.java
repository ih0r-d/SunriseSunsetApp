package com.teamvoy.task.sunrisesunsetapp.utils;


import android.app.Activity;
import android.content.Intent;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.ui.PlacePicker;

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
}
