package org.example;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class Sol4Test {

    private final Sol4 solution = new Sol4();

    @Test
    public void testTrapEmpty() {
        int[] height = {};
        assertEquals(0, solution.trap(height));
    }

    @Test
    public void testTrapSingleElement() {
        int[] height = {1};
        assertEquals(0, solution.trap(height));
    }

    @Test
    public void testTrapTwoElementsNoWater() {
        int[] height = {1, 1};
        assertEquals(0, solution.trap(height));
    }

    @Test
    public void testTrapTwoElementsWithWater() {
        int[] height = {0, 2};
        assertEquals(0, solution.trap(height)); // This should return 0 because there's no container to trap water.
    }

    @Test
    public void testTrapMonotonicallyIncreasing() {
        int[] height = {1, 2, 3, 4, 5};
        assertEquals(0, solution.trap(height)); // No water can be trapped in a strictly increasing array.
    }

    @Test
    public void testTrapMonotonicallyDecreasing() {
        int[] height = {5, 4, 3, 2, 1};
        assertEquals(0, solution.trap(height)); // No water can be trapped in a strictly decreasing array.
    }

    @Test
    public void testTrapSimpleCase() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, solution.trap(height)); // Water trapped = 6
    }

    @Test
    public void testTrapWithValleys() {
        int[] height = {4, 2, 0, 3, 2, 5};
        assertEquals(9, solution.trap(height)); // Water trapped = 9
    }

    @Test
    public void testTrapWithHighPeaks() {
        int[] height = {10, 0, 10};
        assertEquals(10, solution.trap(height)); // Water trapped = 10
    }

    @Test
    public void testTrapAllSameHeight() {
        int[] height = {3, 3, 3, 3, 3};
        assertEquals(0, solution.trap(height)); // No water can be trapped if all elements are the same height.
    }

    @Test
    public void testTrapLargePeakWithSmallValleys() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, solution.trap(height)); // Water trapped = 6
    }

    @Test
    public void testTrapSingleLargeValue() {
        int[] height = {0, 1, 0, 3, 0, 4};
        assertEquals(4, solution.trap(height)); // Water trapped = 6
    }

    @Test
    public void testTrapDescendingThenAscending() {
        int[] height = {5, 4, 3, 2, 1, 2, 3, 4, 5};
        assertEquals(16, solution.trap(height)); // Water trapped = 10
    }

    @Test
    public void testTrapAlternatingSmallValleys() {
        int[] height = {0, 2, 1, 2, 1, 2, 1, 2, 0};
        assertEquals(3, solution.trap(height)); // Water trapped = 4
    }

    @Test
    public void testTrapWithNoValleys() {
        int[] height = {0, 0, 0, 0, 0};
        assertEquals(0, solution.trap(height)); // No water trapped because there's no variation in height.
    }

    @Test
    public void testTrapWithHighPeakInMiddle() {
        int[] height = {1, 2, 5, 3, 1, 2};
        assertEquals(1, solution.trap(height)); // Water trapped = 3
    }

    @Test
    public void testTrapWithLargeInput() {
        int[] height = new int[100000];
        for (int i = 0; i < 100000; i++) {
            height[i] = i % 1000;  // Create a repeating pattern
        }
        // The expected result depends on the pattern. You can compute it manually or simply test performance.
        assertTrue(solution.trap(height) >= 0); // Ensure the solution does not throw any exception.
    }
}

