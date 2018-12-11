package com.example.mylenovo.bealert;

public class country{
    private String countryname;
    private String capital;
    private int sn;
    public country(String mcapital,String mcountryname,int msn){
        this.capital=mcapital;
        this.countryname=mcountryname;
        this.sn=msn;
    }

    public String getCapital() {
        return capital;
    }

    public String getCountryname() {
        return countryname;
    }

    public int getSn() {
        return sn;
    }
}


