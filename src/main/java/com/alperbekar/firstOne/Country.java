package com.alperbekar.firstOne;

public class Country {
    private String CountryName ;
    public String getCountryName() {
        return CountryName;
    }
    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public static void main(String[] args) {
        Country country = new Country();
        country.setCountryName("Scotland");
        String name = country.getCountryName();
        System.out.println(name);
    }
}
