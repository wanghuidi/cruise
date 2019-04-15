package com.huidi.cruise.algorithm;

import java.sql.Time;

public class Berth {
    private String name;
    private boolean isAvailable;
    private Time earlyBusyTime;
    private Time lateBusyTime;


    public Berth(String name, boolean isAvailable, Time earlyBusyTime, Time lateBusyTime) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.earlyBusyTime = earlyBusyTime;
        this.lateBusyTime = lateBusyTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Time getEarlyBusyTime() {
        return earlyBusyTime;
    }

    public void setEarlyBusyTime(Time earlyBusyTime) {
        this.earlyBusyTime = earlyBusyTime;
    }

    public Time getLateBusyTime() {
        return lateBusyTime;
    }

    public void setLateBusyTime(Time lateBusyTime) {
        this.lateBusyTime = lateBusyTime;
    }
}
