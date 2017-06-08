package com.github.crazyorr.playground.model;

public class Location {
    private String city;

    public Location(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return city;
    }
}
