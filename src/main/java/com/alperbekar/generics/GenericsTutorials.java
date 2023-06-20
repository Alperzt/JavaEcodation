package com.alperbekar.generics;

import lombok.Data;

@Data
public class GenericsTutorials <T>{
    private T data;

// Generic Method
    public <M> void Method(M adi, M soyadi){
        System.out.println(adi + " "+ soyadi);
    }
}


class MainPsvm{
    public static void main(String[] args) {
        GenericsTutorials genericsTutorials = new GenericsTutorials();
        genericsTutorials.setData(5);
        GenericsTutorials genericsTutorials1 = new GenericsTutorials();
        genericsTutorials1.setData("alper");
        System.out.println(genericsTutorials1.getData());
        System.out.println(genericsTutorials.getData());


        genericsTutorials.Method("alper",2);
    }
}
