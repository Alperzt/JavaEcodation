package com.alperbekar.examples;

public class ExamplesWithLoops {
    public static void main(String[] args) {
        int oddSum = 0 , oddAmount = 0, sum = 0;
        for (int i = 0; i < 5; i++) {
            int number = (int)(Math.random() * 9 +1);
            if(number%2 == 1){
                oddAmount++;
                oddSum += number;
            }
            sum+=number;
            System.out.println(number);
        }
        System.out.println("Tek sayilarin toplami : "+ oddSum);
        System.out.println("Tek sayiların adedi : "+ oddAmount);
        System.out.println("Sayilarin toplami : "+ sum);
    }
}
