package com.alperbekar.firstOne;

public class AccessModifier {
    public String publicData= "public data";
    private String privateData = "private data";
    protected String protectedData = "protected data";
    String defaultData = "default data";

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.privateData);
        System.out.println(accessModifier.protectedData);
        System.out.println(accessModifier.defaultData);
        System.out.println(accessModifier.publicData);
    }
}
