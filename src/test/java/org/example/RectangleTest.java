package org.example;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;


public class RectangleTest {

    @Test
    public void testEmptyMatrix() {
        rectangle rect = new rectangle();
        char[][] matrix = {};
        assertEquals(0, rect.maximalRectangle(matrix));
    }

    @Test
    public void testNullMatrix() {
        rectangle rect = new rectangle();
        char[][] matrix = null;
        assertEquals(0, rect.maximalRectangle(matrix));
    }

    @Test
    public void testMatrixWithAllZeros() {
        rectangle rect = new rectangle();
        char[][] matrix = {
                {'0', '0'},
                {'0', '0'}
        };
        assertEquals(0, rect.maximalRectangle(matrix));
    }

    @Test
    public void testMatrixWithAllOnes() {
        rectangle rect = new rectangle();
        char[][] matrix = {
                {'1', '1'},
                {'1', '1'}
        };
        assertEquals(4, rect.maximalRectangle(matrix));
    }

    @Test
    public void testMatrixWithSingleRow() {
        rectangle rect = new rectangle();
        char[][] matrix = {
                {'1', '0', '1', '1'}
        };
        assertEquals(2, rect.maximalRectangle(matrix));
    }

    @Test
    public void testMatrixWithSingleColumn() {
        rectangle rect = new rectangle();
        char[][] matrix = {
                {'1'},
                {'1'},
                {'0'},
                {'1'}
        };
        assertEquals(2, rect.maximalRectangle(matrix));
    }

    @Test
    public void testMatrixWithMixedValues() {
        rectangle rect = new rectangle();
        char[][] matrix = {
                {'1', '0', '1', '0'},
                {'1', '1', '1', '0'},
                {'1', '1', '1', '1'}
        };
        assertEquals(6, rect.maximalRectangle(matrix));
    }

    @Test
    public void testMatrixWithComplexShape() {
        rectangle rect = new rectangle();
        char[][] matrix = {
                {'1', '1', '0', '0'},
                {'1', '1', '1', '0'},
                {'0', '1', '1', '1'}
        };
        assertEquals(4, rect.maximalRectangle(matrix));
    }

    @Test
    public void testMatrixWithDisjointRectangles() {
        rectangle rect = new rectangle();
        char[][] matrix = {
                {'1', '0', '1'},
                {'1', '0', '1'},
                {'1', '0', '1'}
        };
        assertEquals(3, rect.maximalRectangle(matrix));
    }
}

