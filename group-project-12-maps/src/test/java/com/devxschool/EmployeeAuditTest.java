package com.devxschool;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EmployeeAuditTest {

    EmployeeAudit employeeAudit = new EmployeeAudit();

    @Test
    public void addEmployeeIdTest1() {
        List<String> employeeList = asList("Nitin Kumar Yadav", "Sudhir Rana", "Komal Sharawat", "Suman Lata", "Naresh Kumar", "Sohan Singh", "Vinod Kumar");
        Map<String,String> actual = employeeAudit.addEmployeeId(employeeList);
        assertEquals("Expected 6th in the list Sohan Singh from:\n"+employeeList.toString(),"Sohan Singh", actual.get("0006"));
    }
    @Test
    public void addEmployeeIdTest2() {
        List<String> employeeList = asList("Nitin Kumar Yadav", "Sudhir Rana", "Komal Sharawat", "Suman Lata", "Naresh Kumar", "Sohan Singh", "Vinod Kumar");
        Map<String,String> actual = employeeAudit.addEmployeeId(employeeList);
        assertEquals("Expected 6th in the list Sudhir Rana from:\n"+employeeList.toString(),"Sudhir Rana", actual.get("0002"));
    }
    @Test
    public void addEmployeeIdTest3() {
        List<String> employeeList = asList("Nitin Kumar Yadav", "Sudhir Rana", "Komal Sharawat", "Suman Lata", "Naresh Kumar", "Sohan Singh", "Vinod Kumar");
        Map<String,String> actual = employeeAudit.addEmployeeId(employeeList);
        assertEquals("Expected 6th in the list Nitin Kumar Yadav from:\n"+employeeList.toString(),"Nitin Kumar Yadav", actual.get("0001"));
    }
    @Test
    public void addEmployeeIdTest4() {
        List<String> employeeList = asList("Nitin Kumar Yadav", "Sudhir Rana", "Komal Sharawat", "Suman Lata", "Naresh Kumar", "Sohan Singh", "Vinod Kumar");
        Map<String,String> actual = employeeAudit.addEmployeeId(employeeList);
        assertEquals("Expected 4th in the list \"Vinod Kumar\" from:\n"+employeeList.toString(),"Vinod Kumar", actual.get("0007"));
    }

    @Test
    public void addEmployeeIdTest5() {
        List<String> employeeList = Collections.emptyList();
        Map<String,String> actual = employeeAudit.addEmployeeId(employeeList);
        assertNull("Expected empty map", actual.get(""));
    }
    @Test
    public void addEmployeeIdTest6() {
        List<String> employeeList = asList("a","a");
        Map<String,String> actual = employeeAudit.addEmployeeId(employeeList);
        assertEquals("Expected 1th in the list a from:\n"+employeeList.toString(),"a", actual.get("0001"));
    }
    @Test
    public void addEmployeeIdTest7() {
        List<String> employeeList = asList("Nitin", "Kumar", "Yadav", "Sudhir", "Rana", "Komal", "Sharawat", "Suman", "Lata", "Naresh", "Kumar", "Sohan", "Singh", "Vinod", "Kumar");
        Map<String,String> actual = employeeAudit.addEmployeeId(employeeList);
        assertEquals("expected size of list:\n" + employeeList.toString(), 15, actual.size());
    }
}
