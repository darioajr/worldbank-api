package br.com.bb.worldbank.model;

import java.util.AbstractMap;

public class Indicator {

    AbstractMap.SimpleImmutableEntry<String, String> indicator;
    AbstractMap.SimpleImmutableEntry<String, String> country;

    String countryiso3code;
    String date;
    String value;
    String unit;
    String obs_status;
    int decimal;

    public Indicator() {
    }

    public Indicator( AbstractMap.SimpleImmutableEntry<String, String> indicator, 
                      AbstractMap.SimpleImmutableEntry<String, String> country, 
                      String countryiso3code, 
                      String date, 
                      String value, 
                      String unit, 
                      String obs_status, 
                      int decimal) {
        this.indicator = indicator;
        this.country = country;
        this.countryiso3code = countryiso3code;
        this.date = date;
        this.value = value;
        this.unit = unit;
        this.obs_status = obs_status;
        this.decimal = decimal;
    }
}