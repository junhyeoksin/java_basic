package com.basic.java.javaObject.constructor.Inheritance;

public class control {

    private int hour;
    private int minute;
    private int second;


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
        this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute <  0 || minute > 59)
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59)
        this.second = second;
    }
}
