package com.starweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private  String CountyName;
    private  String WeatherId;
    private int CityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return CityId;
    }

    public String getCountyName() {
        return CountyName;
    }

    public String getWeatherId() {
        return WeatherId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        WeatherId = weatherId;
    }
}
