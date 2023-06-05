package com.alperbekar.Examples;

import java.util.Scanner;

public class Palindrom {
    public static String MakeReverse(String word) {
        String reverse = "";
        for (int i = 0; i < word.length(); i++) {
            reverse = word.charAt(i) + reverse;
        }
        return reverse;
    }

    public static boolean IsPalindrom(String word){
        String newWord = MakeReverse(word);
        if (newWord.equals(word)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime girin");
        String userData = scanner.next();
        boolean result = IsPalindrom(userData);
        if (result){
            System.out.println("evet palindrom");
        }
        else {
            System.out.println("hayır değil");
        }
    }
}
