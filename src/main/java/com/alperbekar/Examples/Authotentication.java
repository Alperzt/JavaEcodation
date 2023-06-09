package com.alperbekar.Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Authotentication {
    public static void main(String[] args) {
        int trying = 4;
        Scanner scanner = new Scanner(System.in);
        String uName = "admin";
        String pword = "root";
        String[] array = {uName,pword};
        while (true){
            System.out.println("Kullanici adinizi girin : ");
            String uNameCompare = scanner.next();
            System.out.println("Sifrenizi girin : ");
            String pwordCompare = scanner.next();
            if (array[0].equals(uNameCompare) && array[1].equals(pwordCompare)){
                System.out.println("Tebrikler giris sagladiniz !!!");
                break;
            }
            else {
                trying--;
                System.out.println("Yanlis giris yaptiniz kalan giris hakkiniz : " + trying);
            }
            if (trying == 0){
                System.out.println("hesabiniz bloke ediildi");
                break;
            }
        }
    }
}
