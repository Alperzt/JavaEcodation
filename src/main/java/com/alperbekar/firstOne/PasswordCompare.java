package com.alperbekar.firstOne;

import java.util.Scanner;

public class PasswordCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sifrenizi yazın : ");
        String pword = scanner.next();
        System.out.println("Sifrenizi tekrar yazın : ");
        String pword2 = scanner.next();
        if(pword.equalsIgnoreCase(pword2)){
            System.out.println("aynı");
        }
        else System.out.println("değil");
    }
}
