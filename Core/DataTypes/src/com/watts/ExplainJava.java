package com.watts;

public class ExplainJava {
    // Integer
    byte byteMinVal = -128;
    byte byteMaxVal = 127;

    short shortMinVal = -32768;
    short shortMaxVal = 32767;

    int intMinVal = -2147483648;
    int intMaxVal = 2147483647;

    long longMinVal = -9223372036854775808L;
    long longMaxVal = 9223372036854775807L;

    // Floating point
    float floatVal = 1.45f;
    double doubleVal = 4.9d;

    // Character
    char character = 'u';
    char accentedChar = '\u00DA'; //Ú

    //Boolean
    boolean trueBoolean = true;
    boolean falseBoolean = false;

    public void exampleOnAritmeticOperatorDivision() {
        System.out.println("--- Example on How Division Works for Floating and Integers ---");

        System.out.println("For floating points the division operator will respect the floating points. For example 13/5 = " + 13.0f / 5.0f);
        System.out.println("But for integers only the integer result will be displayed. For Example 13/5 = " + 13 / 5);
    }


    public void exampleOnPrefixPostFixOperators() {
        System.out.println("--- Example on How Prefix and PostFix Works ---");

        System.out.println("Original number byteMaxVal = " + byteMaxVal);
        System.out.println("Number with prefix --byteMaxVal operator = " + --byteMaxVal + " decreases the value before displaying the variable.");
        System.out.println("Number with postfix byteMaxVal++ operator = " + byteMaxVal++ + " increases the value after displaying the variable.");
        System.out.println("Number byteMaxVal = " + byteMaxVal);
    }

    public void explainMathOrder() {
        System.out.println("--- Example on Math Order ---");

        byte valA = 21;
        byte valB = 6;
        byte valC = 3;
        byte valD = 1;

        byte result1 = (byte)(valA - valB / valC);
        byte result2 = (byte)((valA - valB) / valC);
        byte result3 = (byte)(valA / valC * valD + valB);
        byte result4 = (byte)(valA / (valC * (valD + valB)));

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
        System.out.println("Result 3 = " + result3);
        System.out.println("Result 4 = " + result4);
    }

    public static void main(String[] args) {
        ExplainJava explainJava = new ExplainJava();

        explainJava.exampleOnAritmeticOperatorDivision();
        System.out.println();
        explainJava.exampleOnPrefixPostFixOperators();
        System.out.println();
        explainJava.explainMathOrder();
    }
}
