package com.starweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String CityName;
    private int CityCode;
    private int ProvinceId;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getCityCode() {
        return CityCode;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getProvinceId() {
        return ProvinceId;
    }

    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        ProvinceId = provinceId;
    }

    public String getCityName() {
        return CityName;
    }
}
