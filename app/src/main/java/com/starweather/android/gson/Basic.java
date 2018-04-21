package com.starweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityNme;
    @SerializedName("id")
    public String weatherId;
    public  Update update;
    public  class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
