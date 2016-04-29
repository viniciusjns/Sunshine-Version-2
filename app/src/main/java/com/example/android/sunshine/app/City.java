package com.example.android.sunshine.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vinicius-PC on 28/04/2016.
 */
public class City {

    private String locationId;
    private String dt; //dateTime
    private String humidity;
    private String pressure;
    private String speed;
    private String deg; //wind direction
    private Temp temp;
    private String weatherId;
    private String main;
    private String desc;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "City{" +
                "locationId='" + locationId + '\'' +
                ", dt='" + dt + '\'' +
                ", humidity='" + humidity + '\'' +
                ", pressure='" + pressure + '\'' +
                ", speed='" + speed + '\'' +
                ", deg='" + deg + '\'' +
                ", temp=" + temp +
                ", weatherId='" + weatherId + '\'' +
                ", main='" + main + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public class Temp {

        String min;
        String max;

        public String getMin() {
            return min;
        }

        public void setMin(String min) {
            this.min = min;
        }

        public String getMax() {
            return max;
        }

        public void setMax(String max) {
            this.max = max;
        }

        @Override
        public String toString() {
            return "Temp{" +
                    "min='" + min + '\'' +
                    ", max='" + max + '\'' +
                    '}';
        }
    }

    public class Weather {

        private String id;
        private String main;
        private String description;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Weather{" +
                    "id='" + id + '\'' +
                    ", main='" + main + '\'' +
                    ", desc='" + description + '\'' +
                    '}';
        }
    }
}
