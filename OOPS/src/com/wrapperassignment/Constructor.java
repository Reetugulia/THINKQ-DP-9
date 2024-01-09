package com.wrapperassignment;

public class Constructor {
    public static void main(String[] args) {
        // Byte 
    	byte b=10;
        Byte byte1 = new Byte(b);
        Byte byte2 = new Byte("20");

        // Short 
        Short short1 = new Short((short) 30);
        Short short2 = new Short("40");

        // Integer 
        Integer int1 = new Integer(50);
        Integer int2 = new Integer("60");
        Integer int3 = Integer.valueOf("70", 8); // Using radix 8

        // Long 
        Long long1 = new Long(80L);
        Long long2 = new Long("90");

        // Character 
        Character char1 = new Character('A');

        // Float
        Float float1 = new Float(100.5f);
        Float float2 = new Float("200.5");

        // Double 
        Double double1 = new Double(300.7);
        Double double2 = new Double("400.8");

        // Boolean class constructors
       // Boolean bool1 = new Boolean(true);
      //  Boolean bool2 = new Boolean("false");

        // Displaying values
        System.out.println("Byte values: " + byte1 + ", " + byte2);
        System.out.println("Short values: " + short1 + ", " + short2);
        System.out.println("Integer values: " + int1 + ", " + int2 + ", " + int3);
        System.out.println("Long values: " + long1 + ", " + long2);
        System.out.println("Character value: " + char1);
        System.out.println("Float values: " + float1 + ", " + float2);
        System.out.println("Double values: " + double1 + ", " + double2);
     //   System.out.println("Boolean values: " + bool1 + ", " + bool2);
    }

}
