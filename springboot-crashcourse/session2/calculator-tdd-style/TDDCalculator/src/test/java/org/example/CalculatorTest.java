package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
//
    private Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @Test
    void testAddInt(){
        int result = calculator.add(2,5);
        assertEquals(7,result);
    }

    @Test
    void testAddLong(){
        long result = calculator.add(1_000_000L,2_000_000L);
        assertEquals(3_000_000, result);
    }

    @Test
    void testAddShort(){
        short result = calculator.add((short)100,(short)200);
        assertEquals(300, result);
    }
    @Test
    void testAddFloat(){
        float result = calculator.add(1.0003f,2.0004f);
        assertEquals(3.0007f, result, 0.0001f);
    }
    @Test
    void testAddDouble(){
        double result = calculator.add(1.003,4.0);
        assertEquals(5.003, result, 0.0001);
    }

    // subtract
    @Test
    void testSubtractInt(){
        int result = calculator.subtract(5, 3);
        assertEquals(2,result);
    }

    @Test
    void testSubtractLong(){
        long result = calculator.subtract(1_000_000L,500_000L);
        assertEquals(500_000, result);
    }

    @Test
    void testSubtractShort(){
        short result = calculator.subtract((short)1000,(short)200);
        assertEquals(800, result);
    }
    @Test
    void testSubtractFloat(){
        float result = calculator.subtract(10.0004f,2.0003f);
        assertEquals(8.0001f, result, 0.0001f);
    }
    @Test
    void testSubtractDouble(){
        double result = calculator.subtract(4.003,4.0);
        assertEquals(0.003, result, 0.0001);
    }
    // multiply
    @Test
    void testMultiplyInt(){
        int result = calculator.multiply(5, 3);
        assertEquals(15,result);
    }

    @Test
    void testMultiplyLong(){
        long result = calculator.multiply(100L,5000L);
        assertEquals(500_000, result);
    }

    @Test
    void testMultiplyShort(){
        short result = calculator.multiply((short)4,(short)4);
        assertEquals(16, result);
    }
    @Test
    void testMultiplyFloat(){
        float result = calculator.multiply(1.01f,2.0f);
        assertEquals(2.02f, result, 0.0001f);
    }
    @Test
    void testMultiplyDouble(){
        double result = calculator.multiply(4.003,2.0);
        assertEquals(8.006, result, 0.0001);
    }

    // divide
    @Test
    void testDivideInt(){
        int result = calculator.divide(5, 3);
        assertEquals(1,result);
    }
    @Test
    void testDivideIntByZero(){
        assertThrows(ArithmeticException.class, ()-> calculator.divide(5, 0));
    }

    @Test
    void testDivideLong(){
        long result = calculator.divide(70,7);
        assertEquals(10, result);
    }
    @Test
    void testDivideLongByZero(){
        assertThrows(ArithmeticException.class, ()-> calculator.divide(5L, 0L));
    }

    @Test
    void testDivideShort(){
        short result = calculator.divide((short)16,(short)3);
        assertEquals(5, result);
    }
    @Test
    void testDivideShortByZero(){
        assertThrows(ArithmeticException.class, ()-> calculator.divide((short)5, (short)0));
    }
    @Test
    void testDivideFloat(){
        float result = calculator.divide(4f,2.0f);
        assertEquals(2.0f, result, 0.0001f);
    }
    @Test
    void testDivideDouble(){
        double result = calculator.divide(4.00,2.0);
        assertEquals(2.0, result, 0.0001);
    }
}