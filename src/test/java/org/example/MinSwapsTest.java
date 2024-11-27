package org.example;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class MinSwapsTest {

    @Test
    public void testBasicCaseNoSwapNeeded() {
        minswaps solution = new minswaps();
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {1, 3, 5, 7};
        assertEquals(0, solution.minSwap(nums1, nums2)); // No swaps needed
    }

    @Test
    public void testMultipleSwapsNeeded() {
        minswaps solution = new minswaps();
        int[] nums1 = {1, 3, 5, 4};
        int[] nums2 = {1, 2, 3, 7};
        assertEquals(1, solution.minSwap(nums1, nums2)); // Swap index 3
    }

    @Test
    public void testAlreadyOptimal() {
        minswaps solution = new minswaps();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 3, 4, 5};
        assertEquals(0, solution.minSwap(nums1, nums2)); // Already optimal
    }

    @Test
    public void testEdgeCaseEmptyArrays() {
        minswaps solution = new minswaps();
        int[] nums1 = {};
        int[] nums2 = {};
        assertEquals(0, solution.minSwap(nums1, nums2)); // No swaps needed for empty arrays
    }

    @Test
    public void testEdgeCaseSingleElement() {
        minswaps solution = new minswaps();
        int[] nums1 = {1};
        int[] nums2 = {2};
        assertEquals(0, solution.minSwap(nums1, nums2)); // Single element, no swaps needed
    }
    @Test
    public void testSwappedPreviousIndex() {
        minswaps solution = new minswaps();
        int[] nums1 = {1, 5, 3, 8};
        int[] nums2 = {1, 2, 6, 7};
        assertEquals(1, solution.minSwap(nums1, nums2)); // Swap at index 2
    }

    @Test
    public void testUnswappedPreviousIndex() {
        minswaps solution = new minswaps();
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};
        assertEquals(0, solution.minSwap(nums1, nums2)); // No swaps needed
    }

    @Test
    public void testMixedConditions() {
        minswaps solution = new minswaps();
        int[] nums1 = {1, 3, 5, 4, 9};
        int[] nums2 = {1, 2, 3, 7, 10};
        assertEquals(1, solution.minSwap(nums1, nums2)); // Swap at index 3
    }

}
