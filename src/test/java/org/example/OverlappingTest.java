package org.example;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class OverlappingTest {

    @Test
    public void testBasicCase() {
        overlapping solution = new overlapping();
        int[] nums = {1, 2, 1, 2, 6, 7, 5, 1};
        int k = 2;
        int[] result = solution.maxSumOfThreeSubarrays(nums, k);
        assertArrayEquals(new int[]{0, 3, 5}, result); // Maximum sum subarrays are at indices 0, 3, and 5
    }

    @Test
    public void testAllEqualElements() {
        overlapping solution = new overlapping();
        int[] nums = {5, 5, 5, 5, 5, 5, 5};
        int k = 2;
        int[] result = solution.maxSumOfThreeSubarrays(nums, k);
        assertArrayEquals(new int[]{0, 2, 4}, result); // Any valid set of three non-overlapping subarrays is acceptable
    }

    @Test
    public void testEdgeCaseSmallArray() {
        overlapping solution = new overlapping();
        int[] nums = {1, 2, 3};
        int k = 1;
        int[] result = solution.maxSumOfThreeSubarrays(nums, k);
        assertArrayEquals(new int[]{0, 1, 2}, result); // All elements individually form subarrays
    }

    @Test
    public void testEdgeCaseArrayTooSmall() {
        overlapping solution = new overlapping();
        int[] nums = {1, 2, 3};
        int k = 2;
        int[] result = solution.maxSumOfThreeSubarrays(nums, k);
        assertArrayEquals(new int[]{}, result); // Not enough elements for three subarrays of size k
    }

}
