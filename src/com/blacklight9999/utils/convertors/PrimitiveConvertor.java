package com.blacklight9999.utils.convertors;

 public class PrimitiveConvertor {
     float float1 = 0.0f;
     int int1 = 12;
     char char1 = 22;


    public char charToInt() {
        int1 = (int) (char1);
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
        return char1;
    }

    public int intToChar() {
        char1 = (char) (int1);
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
        return int1;
    }

    public float floatToChar() {
        char1 = (char) (float1);
        System.out.println("Input float value is " + float1 + ". Output int value is " + char1);
        return float1;
    }
 }
