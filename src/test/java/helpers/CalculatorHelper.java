package helpers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CalculatorHelper {

    public int sumOfNumbers(int a, int b) {
        return a + b;
    }

    public float sumOfFloats(float a, float b) {
        return a + b;
    }

    public double sumOfDoubles(double a, double b) {
        return a + b;
    }

    public BigInteger sumOfBigIntegers(BigInteger a, BigInteger b) {
        return a.add(b);
    }

    public BigDecimal sumOfBigDecimals(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public int differenceOfNumbers(int a, int b) {
        return a - b;
    }

    public float differenceOfFloats(float a, float b) {
        return a - b;
    }

    public BigDecimal differenceOfBigDecimals(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public double differenceOfDoubles(double a, double b) {
        return a - b;
    }

    public BigInteger differenceOfBigIntegers(BigInteger a, BigInteger b) {
        return a.subtract(b);
    }

    public byte differenceOfBytes(byte a, byte b) {
        return (byte) (a - b);
    }

    public short differenceOfShorts(short a, short b) {
        return (short) (a - b);
    }

    public long differenceOfLongs(long a, long b) {
        return a - b;
    }

}
