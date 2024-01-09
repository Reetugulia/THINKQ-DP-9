package com.wrapperassignment;


class ByteExample {
    private byte value;

    ByteExample(byte value) {
        this.value = value;
    }

    byte getByteValue() {
        return value;
    }
}

class ShortExample {
    private short value;

    ShortExample(short value) {
        this.value = value;
    }

    byte getByteValue() {
        return (byte) value;
    }
}

class IntegerExample {
    private int value;

    IntegerExample(int value) {
        this.value = value;
    }

    byte getByteValue() {
        return (byte) value;
    }
}

class LongExample {
    private long value;

    LongExample(long value) {
        this.value = value;
    }

    byte getByteValue() {
        return (byte) value;
    }
}

class FloatExample {
    private float value;

    FloatExample(float value) {
        this.value = value;
    }

    byte getByteValue() {
        return (byte) value;
    }
}

class DoubleExample {
    private double value;

    DoubleExample(double value) {
        this.value = value;
    }

    byte getByteValue() {
        return (byte) value;
    }
}

class BooleanExample {
    private boolean value;

    BooleanExample(boolean value) {
        this.value = value;
    }

    byte getByteValue() {
        return (byte) (value ? 1 : 0);
    }
}


public class ByteMethod { 
	public static void main(String[] args) {
    // Byte
		ByteExample byteExample = new ByteExample((byte) 10);
    byte byteValue = byteExample.getByteValue();
    System.out.println("Byte value: " + byteValue);

    // Short
    ShortExample shortExample = new ShortExample((short) 20);
    byte shortByteValue = shortExample.getByteValue();
    System.out.println("Short value as byte: " + shortByteValue);

    // Integer
    IntegerExample intExample = new IntegerExample(30);
    byte intByteValue = intExample.getByteValue();
    System.out.println("Integer value as byte: " + intByteValue);

    // Long
    LongExample longExample = new LongExample(40L);
    byte longByteValue = longExample.getByteValue();
    System.out.println("Long value as byte: " + longByteValue);

    // Float
    FloatExample floatExample = new FloatExample(50.5f);
    byte floatByteValue = floatExample.getByteValue();
    System.out.println("Float value as byte: " + floatByteValue);

    // Double
    DoubleExample doubleExample = new DoubleExample(60.6);
    byte doubleByteValue = doubleExample.getByteValue();
    System.out.println("Double value as byte: " + doubleByteValue);

    // Boolean
    BooleanExample booleanExample = new BooleanExample(true);
    byte booleanByteValue = booleanExample.getByteValue();
    System.out.println("Boolean value as byte: " + booleanByteValue);
}


}
