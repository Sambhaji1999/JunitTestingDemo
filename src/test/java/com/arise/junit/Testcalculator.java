package com.arise.junit;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;

import org.junit.runners.MethodSorters;


public class Testcalculator {
	
	Calculator cal=new Calculator();
   	
	//@BeforeClass Anotation :it will excute before all the test cases
	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }   
	
	@Test
	public   void testAdd()
	{
		assertEquals(30, cal.add(10, 20));
		
	}
	
	
	@Test
	public void testSubtract()
	{
		assertEquals(10,cal.subtract(20, 10));
		
	}
	
	@Test
	public void testMultiply()
	{
		assertEquals(4,cal.multiply(2, 2));
	}
	
	 @Test
	 public    void testMultiplyy() {
	        assertEquals( "Regular multiplication should work", cal.multiply(4,5), 20);
	    }
	 
	 
	 @Test
	   public  void testMultiplyWithZero() {
	        assertEquals("Multiple with zero should be zero",0,  cal.multiply(0,5));
	        assertEquals("Multiple with zero should be zero", 0, cal.multiply(5,0));
	 }
	 
	 
	
	
	
	
	@Test
	public void testDivide()
	{
		assertEquals(5,cal.divide(10, 2));
	}
	
	
	
	
}
