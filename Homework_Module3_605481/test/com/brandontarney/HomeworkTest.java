/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brandontarney;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tarney
 */
public class HomeworkTest {
    Homework homework;
    
    public HomeworkTest() {
        homework = new Homework();
    }

    /**
     * Test of getOperand1 method, of class Homework.
     */
    @Test
    public void testGetOperand1() {
        System.out.println("getOperand1");
        int expResult = 0;
        int result = Homework.getOperand1();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperand1 method, of class Homework.
     */
    @Test
    public void testSetOperand1() {
        System.out.println("setOperand1");
        int aOperand1 = 1;
        Homework.setOperand1(aOperand1);
    }

    /**
     * Test of getOperand2 method, of class Homework.
     */
    @Test
    public void testGetOperand2() {
        System.out.println("getOperand2");
        int expResult = 0;
        int result = Homework.getOperand2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOperand2 method, of class Homework.
     */
    @Test
    public void testSetOperand2() {
        System.out.println("setOperand2");
        int aOperand2 = 1;
        Homework.setOperand2(aOperand2);
    }

    /**
     * Test of product method, of class Homework.
     */
    @Test
    public void testProduct() {
        System.out.println("product");
        int operand1 = 3;
        int operand2 = 2;
        int expResult = operand1 * operand2;
        int result = Homework.product(operand1, operand2);
        assertEquals(expResult, result);
    }
    
}
