package com.teamvoy.task.sunrisesunsetapp.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class CurrentPlace {
    private CharSequence placeName;
    private CharSequence placeAddress;
    private double latitude;
    private double longitude;


    CurrentPlace(CharSequence placeName, CharSequence placeAddress) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
    }

}
