package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxValueTest {

    @Test
    public void testBasicCase() {
        maxvalue solution = new maxvalue();
        int[] nums = {2, 3, 1, 5, 6};
        assertEquals(12, solution.maxValueAfterReverse(nums)); // Test normal case with valid input
    }

    @Test
    public void testSingleSwapInMiddle() {
        maxvalue solution = new maxvalue();
        int[] nums = {9, 24, 2, 1};
        assertEquals(52, solution.maxValueAfterReverse(nums)); // Test with provided example
    }

    @Test
    public void testTwoElementsArray() {
        maxvalue solution = new maxvalue();
        int[] nums = {5, 1};
        assertEquals(4, solution.maxValueAfterReverse(nums)); // Two elements, no reverse needed
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEdgeCaseArrayTooSmall() {
        maxvalue solution = new maxvalue();
        int[] nums = {1}; // Only one element
        solution.maxValueAfterReverse(nums); // Expect IllegalArgumentException
    }

    @Test
    public void testNoChangeRequired() {
        maxvalue solution = new maxvalue();
        int[] nums = {1, 2, 3, 4};
        assertEquals(5, solution.maxValueAfterReverse(nums)); // Reversing doesn't improve the base value
    }

    @Test
    public void testNegativeNumbers() {
        maxvalue solution = new maxvalue();
        int[] nums = {-3, -2, -1, 0, 1};
        assertEquals(8, solution.maxValueAfterReverse(nums)); // Test with negative numbers
    }

    @Test
    public void testAllEqualElements() {
        maxvalue solution = new maxvalue();
        int[] nums = {5, 5, 5, 5, 5};
        assertEquals(0, solution.maxValueAfterReverse(nums)); // All elements are equal, no improvement possible
    }

    @Test
    public void testIncreasingOrder() {
        maxvalue solution = new maxvalue();
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(16, solution.maxValueAfterReverse(nums)); // Increasing order, test reversing head/tail
    }

    @Test
    public void testDecreasingOrder() {
        maxvalue solution = new maxvalue();
        int[] nums = {10, 8, 6, 4, 2};
        assertEquals(16, solution.maxValueAfterReverse(nums)); // Decreasing order, test reversing head/tail
    }

    @Test
    public void testLargeNumbers() {
        maxvalue solution = new maxvalue();
        int[] nums = {1000, 2000, 3000, 4000};
        assertEquals(5000, solution.maxValueAfterReverse(nums)); // Large numbers to test arithmetic handling
    }

    @Test
    public void testArrayWithZeros() {
        maxvalue solution = new maxvalue();
        int[] nums = {0, 0, 0, 0};
        assertEquals(0, solution.maxValueAfterReverse(nums)); // Array with all zeros, no improvement possible
    }

    @Test
    public void testMixedPositiveAndNegative() {
        maxvalue solution = new maxvalue();
        int[] nums = {-5, 0, 5, -10};
        assertEquals(30, solution.maxValueAfterReverse(nums)); // Mixed positive and negative values
    }

    @Test
    public void testSingleReverseAtBeginning() {
        maxvalue solution = new maxvalue();
        int[] nums = {1, 5, 3, 4};
        assertEquals(9, solution.maxValueAfterReverse(nums)); // Reverse first subarray for optimal result
    }

    @Test
    public void testSingleReverseAtEnd() {
        maxvalue solution = new maxvalue();
        int[] nums = {4, 3, 2, 1};
        assertEquals(5, solution.maxValueAfterReverse(nums)); // Reverse last subarray for optimal result
    }

    @Test
    public void testMaxAtEdges() {
        maxvalue solution = new maxvalue();
        int[] nums = {1, 100, 200, 1};
        assertEquals(497, solution.maxValueAfterReverse(nums)); // Optimal result when reversing the entire array
    }

    @Test
    public void testLargeDifferenceMiddle() {
        maxvalue solution = new maxvalue();
        int[] nums = {1, 1000, 1, 1000, 1};
        assertEquals(3996, solution.maxValueAfterReverse(nums)); // Reverse middle part for best improvement
    }

    @Test
    public void testOnlyTwoDifferentValues() {
        maxvalue solution = new maxvalue();
        int[] nums = {1, 1, 1, 2, 2, 2};
        assertEquals(3, solution.maxValueAfterReverse(nums)); // Reverse either segment, no significant change
    }

    @Test
    public void testNegativeLargeDifference() {
        maxvalue solution = new maxvalue();
        int[] nums = {-1000, -500, 0, 500, 1000};
        assertEquals(4000, solution.maxValueAfterReverse(nums)); // Reverse the whole array for optimal result
    }
}
