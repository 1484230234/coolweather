package com.example.pc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pc on 2019/3/29.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
