package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class smallestnumberTest {

    @Test
    public void testBasicCase() {
        smallestnumber solution = new smallestnumber();
        assertEquals("121", solution.smallestNumber("121", 1));
    }
    @Test
    public void testBasicCase1() {
        smallestnumber solution = new smallestnumber();
        assertEquals("12355", solution.smallestNumber("12355", 50));
    }

    @Test
    public void testSimpleCaseDivisibleT() {
        smallestnumber solution = new smallestnumber();
        assertEquals("121", solution.smallestNumber("121", 2));
    }

    @Test
    public void testLargerT() {
        smallestnumber solution = new smallestnumber();
        assertEquals("116", solution.smallestNumber("111", 6));
    }

    @Test
    public void testImpossibleCase() {
        smallestnumber solution = new smallestnumber();
        assertEquals("227", solution.smallestNumber("222", 7)); // `t` cannot be decomposed fully.
    }

    @Test
    public void testLargeNum() {
        smallestnumber solution = new smallestnumber();
        assertEquals("1111111111555555555888", solution.smallestNumber("999999999999999999999", 1000000000));
    }

    @Test
    public void testSingleDigit() {
        smallestnumber solution = new smallestnumber();
        assertEquals("9", solution.smallestNumber("9", 1)); // Single digit already divisible.
    }

    @Test
    public void testAddLeadingOnes() {
        smallestnumber solution = new smallestnumber();
        assertEquals("11111111112", solution.smallestNumber("9999999999", 2)); // Adding leading `1`s.
    }

    @Test
    public void testAllNines() {
        smallestnumber solution = new smallestnumber();
        assertEquals("999", solution.smallestNumber("999", 3)); // All digits 9, divisible adjustment.
    }

    @Test
    public void testNoChangeRequired() {
        smallestnumber solution = new smallestnumber();
        assertEquals("1", solution.smallestNumber("1", 1)); // Input and `t` already match.
    }

    @Test
    public void testLargeTWithNoChange() {
        smallestnumber solution = new smallestnumber();
        assertEquals("-1", solution.smallestNumber("9999999999", 99991)); // Add leading `1`s with adjustment.
    }

    @Test
    public void testEdgeCaseGCDZero() {
        smallestnumber solution = new smallestnumber();
        assertEquals("1111", solution.smallestNumber("1000", 1)); // Covers GCD handling.
    }

    @Test
    public void testSmallestWithTrailingZeros() {
        smallestnumber solution = new smallestnumber();
        assertEquals("121", solution.smallestNumber("120", 2)); // Test case with trailing zeros.
    }

    @Test
    public void testMaxResultFromDigits() {
        smallestnumber solution = new smallestnumber();
        assertEquals("589", solution.smallestNumber("123", 360)); // Compute maximum valid permutation.
    }

    @Test
    public void testEmptyString() {
        smallestnumber solution = new smallestnumber();
        assertEquals("", solution.smallestNumber("", 1)); // Edge case: empty input.
    }

    @Test
    public void testLargeTWithInvalidCombination() {
        smallestnumber solution = new smallestnumber();
        assertEquals("11125", solution.smallestNumber("11111", 10)); // Test case where no valid number exists.
    }
}
