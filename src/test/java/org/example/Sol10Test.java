package org.example;

import java.util.*;
import java.lang.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Sol10Test {

    @Test
    public void testNumberToWords_Zero() {
        Sol10 solution = new Sol10();
        assertEquals("Zero", solution.numberToWords(0)); // Special case for zero
    }

    @Test
    public void testNumberToWords_SingleDigit() {
        Sol10 solution = new Sol10();
        assertEquals("One", solution.numberToWords(1));
        assertEquals("Nine", solution.numberToWords(9));
    }

    @Test
    public void testNumberToWords_Teens() {
        Sol10 solution = new Sol10();
        assertEquals("Ten", solution.numberToWords(10));
        assertEquals("Thirteen", solution.numberToWords(13));
        assertEquals("Nineteen", solution.numberToWords(19));
    }

    @Test
    public void testNumberToWords_Tens() {
        Sol10 solution = new Sol10();
        assertEquals("Twenty", solution.numberToWords(20));
        assertEquals("Ninety", solution.numberToWords(90));
        assertEquals("Twenty One", solution.numberToWords(21));
    }

    @Test
    public void testNumberToWords_Hundreds() {
        Sol10 solution = new Sol10();
        assertEquals("One Hundred", solution.numberToWords(100));
        assertEquals("One Hundred Twenty Three", solution.numberToWords(123));
    }

    @Test
    public void testNumberToWords_Thousands() {
        Sol10 solution = new Sol10();
        assertEquals("One Thousand", solution.numberToWords(1000));
        assertEquals("Twelve Thousand Three Hundred Forty Five", solution.numberToWords(12345));
    }

    @Test
    public void testNumberToWords_Millions() {
        Sol10 solution = new Sol10();
        assertEquals("One Million", solution.numberToWords(1000000));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", solution.numberToWords(1234567));
    }

    @Test
    public void testNumberToWords_Billions() {
        Sol10 solution = new Sol10();
        assertEquals("One Billion", solution.numberToWords(1000000000));
        assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety", solution.numberToWords(1234567890));
    }

    @Test
    public void testNumberToWords_Complex() {
        Sol10 solution = new Sol10();
        assertEquals("Seven Hundred Eighty Nine Thousand One Hundred Twenty Three", solution.numberToWords(789123));
        assertEquals("Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven", solution.numberToWords(2147483647)); // Max integer
    }
}
