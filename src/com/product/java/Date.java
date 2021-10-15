package com.product.java;

public class Date {
    int day, mouth, year;

    public Date(int day, int mouth, int year) {
        this.day = day;
        this.mouth = mouth;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        Print.outln(this.year+"-"+this.mouth+"-"+this.day);
    }
}
