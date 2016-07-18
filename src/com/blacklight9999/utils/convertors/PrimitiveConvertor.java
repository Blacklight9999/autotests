package com.blacklight9999.utils.convertors;

import jdk.nashorn.internal.parser.Scanner;
//import java.lang.String ??
//import java.io.InputStream ??



public class PrimitiveConvertor {
    float float1 = 2.2f;
    int int1 = 12;
    char char1 = 22;

    public void charToInt() {
        int1 = (int) (char1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
    }


    public void intToChar() {
        char1 = (char) (int1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
    }


    public void floatToChar() {
        char1 = (char) (float1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input float value is " + float1 + ". Output int value is " + char1);
    }
}
