package com.bulatov;

/** Математические, логические операторы. Переполнение при вычислении
 * @author bulatov
 * @version 01
 */

public class Example {
    public static void main(String[] args) {
        byte varByte1 = 124;
        byte varByte2 = 23;
        int varInt = 347;
        double varDouble1 = 0.4d;
        boolean varBoolResult;

        byte varByteResult1 = (byte) (varByte1 + varByte2);
        int varByteResult2 = varByte1 + varByte2;
        double varIntDoubleResult1 = varInt + varDouble1;
        int varIntDoubleResult2 = (int) (varInt + varDouble1);
        varBoolResult = varIntDoubleResult1 < varInt;

        System.out.println("--------------------------------------------");
        System.out.println("Результат приведения к byte  при переполнении   " + varByteResult1);
        System.out.println("--------------------------------------------");
        System.out.println("Результат приведения к int  при переполнении   " + varByteResult2);
        System.out.println("--------------------------------------------");
        System.out.println("Результат сложения int и double (приведение к double)   " + varIntDoubleResult1);
        System.out.println("--------------------------------------------");
        System.out.println("Результат сложения int и double (приведение к int)   " + varIntDoubleResult2);
        System.out.println("--------------------------------------------");
        System.out.println("Результат сравнения   " + varBoolResult);
        System.out.println("--------------------------------------------");
    }
}

