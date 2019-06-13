package com.api.locationtracker.location;
import java.io.Serializable;
import java.util.Date;

public class Location implements Serializable {

    private static final long serialVersionUID = 134443432545435L;
    private Integer locationId;

    private Float latitude;

    private Float longitude;

    private Date date;

    private String time;

    Location() {}

    Location(Integer locationId, Float latitude, Float longitude, Date date, String time) {
        this.locationId = locationId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.time = time;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}