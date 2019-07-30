package com.example.android.quakereport;

public class Earthquake {
    /** Magnitude of the earthquake */
    private Double mMagnitude;

    /** Location of the earthquake */
    private String mLocation;
    private String mUrl ;
    private long mTimeInMilliseconds;

    public Earthquake(Double mag , String loc , long time, String url){
        mTimeInMilliseconds=time;
        mLocation = loc;
        mMagnitude = mag;
        mUrl = url ;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmLocation() {
        return mLocation;
    }

    public Double getmMagnitude() {
        return mMagnitude;
    }

    public String getmUrl() {
        return mUrl;
    }
}
