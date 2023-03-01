package com.denre.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();


    @Test
    public void addZeroPlusZero() {
        int sumZero = calculator.add(0, 0);
        assertEquals(0, sumZero, "The Excepting Result is 0");
    }

    @Test
    public void addOnePlusOne() {
//        Calculator calculator = new Calculator();
        int sumOne = calculator.add(1, 1);
        assertEquals(2, sumOne, "The Expected Result is : 2");
    }

    @Test
    public void addNegativeTest() {
//        Calculator calculator = new Calculator();
        int sumN = calculator.add(-3, 5);
        assertEquals(2, sumN);
    }

//@Test
//    public void addMaxValTest() {
//        int sumMax = calculator.add(Integer.MAX_VALUE, 1);
//        System.out.println(sumMax);
//        assertEquals(Integer.MAX_VALUE + 1L, sumMax);
//    }

    @Test
    public void subOneMinusOne(){
        int subOne = calculator.subTract(1,1);
        assertEquals(0,subOne);
    }
    @Test
    public void subOneMinusZero(){
        int subZero = calculator.subTract(1,0);
        assertEquals(1,subZero);
    }
    @Test
    public void subMax(){
        int subMax = calculator.subTract(Integer.MAX_VALUE,Integer.MAX_VALUE);
        assertEquals(0,subMax);
    }

    @Test
    public void divMAX(){
        double divMax = calculator.div(0,1.0);
        assertEquals(0,divMax);
    }

    @Test
    public void multiValue(){
        double multiVal = calculator.multi(0.5,0.1);
        assertEquals(0.05,multiVal);
    }

}
