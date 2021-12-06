package icu.maiddragon.web;

import java.util.Objects;

public class WebApplication {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(2005,2,14);
        MyTime myTime1 = new MyTime(2005,3,14);
        System.out.println(myTime.toString());
    }
}

class MyTime {
    private final int year;
    private final int mouth;
    private final int day;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTime myTime = (MyTime) o;
        return year == myTime.year &&
                mouth == myTime.mouth &&
                day == myTime.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, mouth, day);
    }

    @Override
    public String toString() {
        return year+"-"+mouth+"-"+day;
    }

    public MyTime(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }
}