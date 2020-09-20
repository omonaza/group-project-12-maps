package com.devxschool;

import java.util.*;

public class MapUtil {

    public static void main(String[] args) {
        /**
         * Remove null values from a map
         */
        Map<Integer, Double> numberMap = new HashMap<>();
        numberMap.put(0, 0.0);
        numberMap.put(1, null);
        numberMap.put(2, 2.0);
        numberMap.put(3, null);
        numberMap.put(4, 4.0);
        numberMap.put(5, 2.0);
        numberMap.put(6, 4.0);
        numberMap.put(null, 4.0);

        MapUtil mapUtil = new MapUtil();

        System.out.println(mapUtil.removeNullValues(numberMap));
    }

    public Map removeNullValues(Map map) {
        //TODO implement this method
        Map <Integer , Double> functionMap = new HashMap<>();
        functionMap.putAll(map);
        Set <Map.Entry <Integer, Double>> mapSet = map.entrySet();
        for (Map.Entry<Integer, Double> ms : mapSet){
            Integer key = ms.getKey();
            if (functionMap.get(key) == null){
                functionMap.remove(key);
            }
        }
        return functionMap;


    }
}
