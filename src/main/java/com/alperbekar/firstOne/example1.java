package com.alperbekar.firstOne;

import javax.swing.*;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        String sayi = "14";
		int number = Integer.parseInt(sayi);
		System.out.println(number);

        int theNumber = Integer.parseInt(JOptionPane.showInputDialog("1.sayıyı girer misin ?"));
        System.out.println("Joption pane : " + theNumber);

        /* ------------------------------------------------------- */

		int random = (int) (Math.random() * 100 + 1);
		System.out.println(random);

        Random random2 = new Random();
        int number2 = random2.nextInt() ;
        System.out.println(number2);

        String kelime = "Alper Bekar";
        String[] temp = kelime.split(" ");
        System.out.printf(temp[1]);

      /*  ------------------------------------------------------- */

        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n1. adı giriniz : ");
        String ad = scanner.next();

        String soyad = JOptionPane.showInputDialog("soyadi girer misiniz ? ");
        String fullName = ad.concat(" " + soyad);
        System.out.println(fullName.substring(4));
        if (fullName.equals("deneme")) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
