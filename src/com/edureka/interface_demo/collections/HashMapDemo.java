package com.edureka.interface_demo.collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("1", "Pamela");
        map.put("3", "Vinay");
        map.put("2", "Ravindra");
        map.put("6", "Hanif");
        map.put("4", "Usha");
        map.put("5", "Hanif");

        Collection<String> values = map.values();
        Iterator<String> valueIterator = values.iterator();
        while (valueIterator.hasNext()){
            System.out.println(valueIterator.next());
        }

        map.keySet();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> mapEntriesIterator = entrySet.iterator();
        while(mapEntriesIterator.hasNext()){
            Map.Entry<String, String> entry = mapEntriesIterator.next();
            System.out.println("Key : "+ entry.getKey()+ " Value :: "+entry.getValue());
        }

        Set<String> stringSet = map.keySet();
        /*Iterator<String> stringIterator = stringSet.iterator();
        while(stringIterator.hasNext()){
            System.out.println(map.get(stringIterator.next()));
        }*/

        for(Map.Entry<String, String> str: entrySet){
            System.out.println(str.getKey());
            System.out.println(str.getValue());
        }

    }
}