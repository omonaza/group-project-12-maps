package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FirstAndLastVehicleTest {

    FirstAndLastVehicle firstAndLastVehicle = new FirstAndLastVehicle();


    @Test
    public void printTest1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        firstAndLastVehicle.print();
        assertEquals("First car should be Mercedes",
                "1=Mercedes\n" +
                        "10=Ford\n",
                out.toString());

    }

    @Test
    public void printTest2() {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));


        firstAndLastVehicle.print();

        assertEquals("Last car needs to be Ford", "1=Mercedes\n" +
                        "10=Ford\n",
                out.toString());

    }

    @Test
    public void printTest3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        firstAndLastVehicle.print();
        assertEquals("First and last cars must be Mercedes and Ford" +
                        ", because it is ordered by a key",
                "1=Mercedes\n" + "10=Ford\n",
                out.toString());
    }

}
