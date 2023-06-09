package com.alperbekar.firstOne;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] array = {5, 9, 8, 2, 3, 1};
        Arrays.sort(array);
        for(int temp : array){
            System.out.println(temp);
        }
        String arrayString = array.toString();
        System.out.println(arrayString);

        System.out.println(array.equals(1));
    }
}
