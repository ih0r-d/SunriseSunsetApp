package com.teamvoy.task.sunrisesunsetapp.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class DataResponse {
    private String sunrise;
    private String sunset;
    private String solar_noon;
    private String day_length;
    private String civil_twilight_begin;
    private String civil_twilight_end;
    private String nautical_twilight_begin;
    private String nautical_twilight_end;
    private String astronomical_twilight_begin;
    private String astronomical_twilight_end;

    private String status;

    private static final String STATUS_OK = "OK";
    private static final String STATUS_INVALID_REQUEST = "INVALID_REQUEST";
    private static final String STATUS_INVALID_DATE = "INVALID_DATE";
    private static final String STATUS_UNKNOWN_ERROR = "UNKNOWN_ERROR";
}
