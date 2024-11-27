package org.example;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class IntervalsTest {

    @Test
    public void testEmptyArray() {
        int[][] arr = {};
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, intervals.mergeOverlapping(arr));
    }

    @Test
    public void testSingleInterval() {
        int[][] arr = {{1, 3}};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 3));
        assertEquals(expected, intervals.mergeOverlapping(arr));
    }

    @Test
    public void testNonOverlappingIntervals() {
        int[][] arr = {{1, 3}, {5, 7}, {8, 10}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(5, 7),
                Arrays.asList(8, 10)
        );
        assertEquals(expected, intervals.mergeOverlapping(arr));
    }

    @Test
    public void testOverlappingIntervals() {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 6),
                Arrays.asList(8, 10),
                Arrays.asList(15, 18)
        );
        assertEquals(expected, intervals.mergeOverlapping(arr));
    }

    @Test
    public void testFullyNestedIntervals() {
        int[][] arr = {{1, 10}, {2, 5}, {6, 9}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 10)
        );
        assertEquals(expected, intervals.mergeOverlapping(arr));
    }

    @Test
    public void testTouchingIntervals() {
        int[][] arr = {{1, 3}, {3, 5}, {5, 7}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 7)
        );
        assertEquals(expected, intervals.mergeOverlapping(arr));
    }

    @Test
    public void testUnsortedInput() {
        int[][] arr = {{8, 10}, {1, 3}, {2, 6}, {15, 18}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 6),
                Arrays.asList(8, 10),
                Arrays.asList(15, 18)
        );
        assertEquals(expected, intervals.mergeOverlapping(arr));
    }

    @Test
    public void testIdenticalIntervals() {
        int[][] arr = {{1, 3}, {1, 3}, {1, 3}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 3)
        );
        assertEquals(expected, intervals.mergeOverlapping(arr));
    }

    @Test
    public void testNegativeIntervals() {
        int[][] arr = {{-10, -5}, {-8, -2}, {0, 3}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-10, -2),
                Arrays.asList(0, 3)
        );
        assertEquals(expected, intervals.mergeOverlapping(arr));
    }

    @Test
    public void testMixedIntervals() {
        int[][] arr = {{-10, -5}, {1, 3}, {-8, -2}, {5, 7}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-10, -2),
                Arrays.asList(1, 3),
                Arrays.asList(5, 7)
        );
        assertEquals(expected, intervals.mergeOverlapping(arr));
    }
}

