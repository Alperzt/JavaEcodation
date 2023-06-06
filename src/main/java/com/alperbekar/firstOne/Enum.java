package com.alperbekar.firstOne;

public enum Enum {
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
}
class EnumMain {
    public static void main(String[] args) {
        System.out.println(Enum.PAZARTESI);
        System.out.println(Enum.PAZARTESI.toString());
        System.out.println(Enum.PAZARTESI.ordinal());
        System.out.println(Enum.PAZARTESI.values()[1]);
    }
}
