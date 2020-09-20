package com.devxschool;

import java.util.*;

public class MapsComparison {

    public static void main(String[] args) {
        /**
         * Verify map has same values as another map ignoring null values
         */

        Map<String,String> values = new HashMap<>();
        values.put("1", "HeyHey");
        values.put("0", null);
        values.put("23", "NoNo");
        values.put("2", null);
        values.put("4", "AhAhAhA");

        Map<String,String> values2 = new HashMap<>();
        values2.put("1", "HeyHey");
        values2.put("0", "null");
        values2.put("23", "NoNo");
        values2.put("2", "empty");
        values2.put("4", "AhAhAhA");

        MapsComparison mapsComparison = new MapsComparison();

        System.out.println(mapsComparison.equalsIgnoringNullValues(values, values2));
    }

    public boolean equalsIgnoringNullValues(Map map1, Map map2) {
        //TODO implement this method

        boolean result = false;
        if (map1.size() != map2.size()) {
            result = false;
        }
        for (Object key : map1.keySet()) {
            if (map1.get(key) != null) {
                if (!map1.get(key).equals(map2.get(key))) {
                    result = false;
                } else {
                    result = true;
                }
            }
        }
        return result;





    }
}
