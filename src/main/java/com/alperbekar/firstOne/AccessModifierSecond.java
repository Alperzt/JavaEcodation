package com.alperbekar.firstOne;

public class AccessModifierSecond {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        //System.out.println(accessModifier.privateData);
        System.out.println(accessModifier.protectedData);
        System.out.println(accessModifier.defaultData);
        System.out.println(accessModifier.publicData);
    }
}
