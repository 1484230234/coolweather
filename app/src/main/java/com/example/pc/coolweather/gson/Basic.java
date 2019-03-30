package com.example.pc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pc on 2019/3/29.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
