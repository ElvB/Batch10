package HomeWork12;

import java.util.Scanner;

public class Time {

    int hour=15;
    int minutes;
    int second;
    int month;
    int year;

    public Time() {

    }

    public Time(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    public Time(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public Time(int hour, int minutes, int second, int month, int year) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
        this.month = month;
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minutes;
    }

    public int getSecond() {
        return second;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            return 0;
        }
        return hour;
    }

    public int setMinute(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            return 0;
        }
        return minutes;
    }

    public int setSecond(int second) {
        if (second < 0 || second >= 60) {
            return 0;
        }
        return second;
    }

    public int setMonth(int month) {
        if (month < 0 || month >= 12) {
            return 0;
        }
        return month;
    }

    public int setYear(int year) {
        if (month < 0) {
            return 0;
        }
        return month;
    }

    public int amPm(int hour) {
        if (hour < 12) {
            System.out.println(hour + " a.m.");
        } else if (hour >= 12 && hour <= 24) {
            System.out.println(hour + " p.m.");
        } else
            return 0;
        return hour;
    }

    public String seasons(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";

            case 9:
            case 10:
            case 11:
                return "Fall";
            default:
                System.out.println("Invalid entry");
        }
        return null;
    }

    public void printTime(int hour, int minute, int second) {
        System.out.println(hour + "/" + minute + "/" + second);
    }

    public void printDate(int month, int year) {
        System.out.println(month + "/" + year);
    }

    public String toString() {
        return hour + "/" + minutes + "/" + second + " - " + month + "/" + year;
    }
    public void printInstruction(){

    }
}