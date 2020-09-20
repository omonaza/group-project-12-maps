package com.devxschool;


import java.util.*;

public class FirstAndLastVehicle {

    public static void main(String[] args) {
        /**
         * Create a map of cars, so they have orders
         * and print out first and last entry in the map
         * ex:
         * 5, "BMW"
         * 3, "Tesla"
         * 1, "Mercedes"
         * 4, "Audi"
         * 10, "Ford"
         *
         * print out:
         * 1, "Mercedes"
         * 10, "Ford"
         */

        //TODO write your code here
        FirstAndLastVehicle firstAndLastVehicle = new FirstAndLastVehicle();
        firstAndLastVehicle.print();
    }

    public void print() {
        //TODO implement this method
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cars you want to enter: ");
        Integer numberOfCarsEntered = scan.nextInt();
        System.out.println("List the cars: ");

        List<String> carsEntered = new ArrayList<String>();
        for (int i = 0; i < numberOfCarsEntered; i++) {
            carsEntered.add(scan.next());
        }
        System.out.println(carsEntered);
        TreeMap<Integer, String> cars = new TreeMap<>();
        for (int i = 0; i < numberOfCarsEntered; i++) {
            cars.put(i+1, carsEntered.get(i));
        }
        System.out.println(cars.firstEntry());
        System.out.println(cars.lastEntry());


    }
}
