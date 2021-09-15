package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {

	@Test
	public void testAdd() {
		//test data
		int num1=10;
		int num2=20;
		//assertEquals(30, Main.add(10,20));
		assertFalse(Main.compare(num1, num2));
		
	}
	@Test
	public void testObjects() {
        Flight f1=new Flight(1001, "Chennai", "Delhi");
//        Flight f2=new Flight(1001, "Chennai", "Delhi");
        Flight f2=f1;
        assertSame(f1, f2);
    }

}
