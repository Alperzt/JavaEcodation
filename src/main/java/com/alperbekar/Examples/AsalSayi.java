package com.alperbekar.Examples;

import java.util.Scanner;

public class AsalSayi {
    public static void AsalSayi(int number){
        int counter = 0;
        if (number<2){
            System.out.println("asal değil");
        }
        else {
            for (int i = 2 ; i <number; i++) {
                if(number%i==0){
                    counter++;
                }
            }
            if (counter>0){
                System.out.println("asal değil");
            }
            else {
                System.out.println("asal");
            }
        }
    }
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sayı girin");
            int number = scanner.nextInt();
            AsalSayi(number);
        }
    }
}
