package com.example.earthquakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private String murl;
    private long mTimeInMilliseconds;


    public Earthquake(double mMagnitude, String mLocation, long TimeInMilliseconds,String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds=TimeInMilliseconds;
        this.murl=url;
    }

    public String getMurl() {
        return murl;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}
