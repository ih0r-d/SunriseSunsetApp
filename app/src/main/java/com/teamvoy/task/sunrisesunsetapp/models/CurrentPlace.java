package com.teamvoy.task.sunrisesunsetapp.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CurrentPlace {
    private String placeName;
    private String placeAddress;
    private double latitude;
    private double longitude;


}
