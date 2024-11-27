package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class Sol3Test {

    private final Sol3 solution = new Sol3();

    @Test
    public void testFirstArrayEmpty() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};
        assertEquals(2.0, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }

    @Test
    public void testSecondArrayEmpty() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        assertEquals(2.0, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }

    @Test
    public void testSameSizeArrays() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        assertEquals(2.5, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }

    @Test
    public void testOddTotalLength() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(2.0, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }

    @Test
    public void testEvenTotalLength() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        assertEquals(2.5, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }

    @Test
    public void testAllElementsEqual() {
        int[] nums1 = {2, 2, 2};
        int[] nums2 = {2, 2};
        assertEquals(2.0, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }

    @Test
    public void testLargeDifferenceInArrays() {
        int[] nums1 = {1};
        int[] nums2 = {1000};
        assertEquals(500.5, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }

    @Test
    public void testNegativeValues() {
        int[] nums1 = {-5, -3, -1};
        int[] nums2 = {-4, -2, 0};
        assertEquals(-2.5, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }

    @Test
    public void testLargeArrays() {
        int[] nums1 = new int[1000];
        int[] nums2 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums1[i] = i;
            nums2[i] = i + 1000;
        }
        // The median will be 999.5
        assertEquals(999.5, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }

    @Test
    public void testCaseWhereMedianIsAnInteger() {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5, 6, 7, 8};
        assertEquals(4.5, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }

    @Test
    public void testCaseWhereMedianIsFractional() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        assertEquals(2.5, solution.findMedianSortedArrays(nums1, nums2), 0.0001);
    }
}

