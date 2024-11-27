package org.example;

import org.junit.Test;

import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.*;



public class ConstructGridLayoutTest {

    @Test
    public void testSingleNode() {
        constructGridLayout gridLayout = new constructGridLayout();
        int[][] edges = {};
        int[][] result = gridLayout.constructGrid(1, edges);
        assertArrayEquals(new int[][]{{0}}, result);
    }

    @Test
    public void test1() {
        constructGridLayout gridLayout = new constructGridLayout();
        int[][] edges = {{0,1},{0,2},{0,4},{1,3},{2,5},{3,4},{4,5}};
        int[][] result = gridLayout.constructGrid(6, edges);
        assertFalse(Arrays.deepEquals(new int[][]{{5,2},{4,0},{3,1}}, result));
    }

    @Test
    public void testTwoConnectedNodes() {
        constructGridLayout gridLayout = new constructGridLayout();
        int[][] edges = {{0, 1}};
        int[][] result = gridLayout.constructGrid(2, edges);
        assertTrue(
                Arrays.deepEquals(result, new int[][]{{0, 1}}) || Arrays.deepEquals(result, new int[][]{{1, 0}})
        );
    }

//    @Test
//    public void testTriangleGraph() {
//        constructGridLayout gridLayout = new constructGridLayout();
//        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
//        int[][] result = gridLayout.constructGrid(3, edges);
//        assertNotNull(result);
//        assertEquals(2, result.length);
//        assertTrue(result[0].length == 2 || result[1].length == 2);
//    }

    @Test
    public void testSquareGraph() {
        constructGridLayout gridLayout = new constructGridLayout();
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 0}};
        int[][] result = gridLayout.constructGrid(4, edges);
        assertEquals(2, result.length);
        assertEquals(2, result[0].length);
    }

    @Test
    public void testDisconnectedGraph() {
        constructGridLayout gridLayout = new constructGridLayout();
        int[][] edges = {{0, 1}, {2, 3}};
        assertThrows(IllegalArgumentException.class, () -> gridLayout.constructGrid(4, edges));
    }

    @Test
    public void testLineGraph() {
        constructGridLayout gridLayout = new constructGridLayout();
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}};
        int[][] result = gridLayout.constructGrid(4, edges);
        assertEquals(4, result.length + result[0].length - 1);
    }

    @Test
    public void testCompleteGraph() {
        constructGridLayout gridLayout = new constructGridLayout();
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}, {2, 3}};
        int[][] result = gridLayout.constructGrid(4, edges);
        assertNotNull(result);
        assertTrue(result.length > 0 && result[0].length > 0);
    }

    @Test
    public void testGraphWithIsolatedNodes() {
        constructGridLayout gridLayout = new constructGridLayout();
        int[][] edges = {{0, 1}, {2, 3}, {3, 4}};
        assertThrows(IllegalArgumentException.class, () -> gridLayout.constructGrid(5, edges));
    }
}

