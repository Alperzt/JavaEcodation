package com.alperbekar.firstOne;

import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("karakter girin : ");
        char data = scanner.nextLine().charAt(0);
        if (Character.isDigit(data)){
            System.out.println("sayı : " + data);
        } else if (Character.isLetter(data)) {
            System.out.println("harf : " + data);
        }
        else {
            System.out.println(" simge aşkın olayım : " + data);
        }
    }
}
