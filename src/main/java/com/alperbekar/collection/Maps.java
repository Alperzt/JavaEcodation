package com.alperbekar.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class Maps {
    public static void main(String[] args) {
        Map<String, Object> mapList = new HashMap<>();
        mapList.put(UUID.randomUUID().toString(),"Alper");
        mapList.put(UUID.randomUUID().toString(),"Coldplay");
        mapList.put(UUID.randomUUID().toString(),"Scotland");

        for (String key:mapList.keySet()) {
            System.out.println(key +" -> "+ mapList.get(key));
        }
        for (Object value:mapList.values()) {
            System.out.println(value);
        }
    }
}
