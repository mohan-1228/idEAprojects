package edu.missouristate.model;

import java.math.BigDecimal;

public class Properties {
    private BigDecimal mag;
    private String place;
    private Long time;

    public BigDecimal getMag() {
        return mag;
    }

    public void setMag(BigDecimal mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
