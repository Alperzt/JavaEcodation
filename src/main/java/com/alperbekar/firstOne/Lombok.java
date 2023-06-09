package com.alperbekar.firstOne;

import lombok.Data;

@Data
public class Lombok {
    private int id;
    private String uName;
    private String customerNumber;

    public static void main(String[] args) {
        Lombok lombok = new Lombok();
        lombok.getId();
    }
}
