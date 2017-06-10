/*
 * Homework 3 (Module 3 605.481)
    The second part of the Homework is a VERY basic Java program. If you haven't done Java before, this will be good, if you have, this is trivial so relax and enjoy an easy project!.
	1	to create a method (in an arbitrary class of your choosing) that takes integers as arguments (not prompt the user, these are arguments to your program) and returns the product of the two integers.
	2	The method will have an "int" return type.
	3	In order to show your method works, you should have a "main" method in the class that requires the users provide two arguments after the command, and then converts those two arguments to integers.
	4	You will then pass those ints to your method, get the result, and then print the result back out to the console. If the number is negative, print out a negative amount as a number in parenthesis () rather than have a negative sign.
    We haven't covered exceptions yet, so you can assume the user will pass you integers from the command prompt.
 * @author Brandon Tarney
 * @date 6/7/2017
 */
package com.brandontarney;

/**
 *
 * @author Tarney
 */
public class Homework {

    /**
     * @return the operand1
     */
    public static int getOperand1() {
        return operand1;
    }

    /**
     * @param aOperand1 the operand1 to set
     */
    public static void setOperand1(int aOperand1) {
        operand1 = aOperand1;
    }

    /**
     * @return the operand2
     */
    public static int getOperand2() {
        return operand2;
    }

    /**
     * @param aOperand2 the operand2 to set
     */
    public static void setOperand2(int aOperand2) {
        operand2 = aOperand2;
    }

    private static int operand1;
    private static int operand2;

    public Homework() {
        this.operand1 = 0;
        this.operand2 = 0;
    }

    /**
     * PRODUCT
     * 
     * @param operand1  integer value to be multiplied by the other param
     * @param operand2  integer value to be multiplied by the other param
     * @return  int     integer value of (operand1 * operand2)
     */
    public static int product(int operand1, int operand2) {
        return operand1 * operand2;
    }

    /**
     * MAIN
     *
     * @param   String[]    2 integer inputs to be multiplied by each other
     */
    public static void main(String[] args) {
        System.out.println("Homework - by Brandon Tarney");
        setOperand1(Integer.parseInt(args[0]));
        setOperand2(Integer.parseInt(args[1]));
        int result = product(getOperand1(), getOperand2());
        System.out.println("arg1(" + getOperand1()
                + ") + arg2(" + getOperand2()
                + ") = " + result);
    }

}
