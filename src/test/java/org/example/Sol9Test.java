package org.example;

import java.util.*;
import java.lang.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Sol9Test {

    @Test
    public void testStrangePrinter_SingleCharacter() {
        Sol9 solution = new Sol9();

        // Single character
        assertEquals(1, solution.strangePrinter("a")); // Only 1 turn needed
    }

    @Test
    public void testStrangePrinter_AllSameCharacters() {
        Sol9 solution = new Sol9();

        // All characters are the same
        assertEquals(1, solution.strangePrinter("aaaaa")); // Print all in one turn
    }

    @Test
    public void testStrangePrinter_AlreadyOptimized() {
        Sol9 solution = new Sol9();

        // Already optimized string
        assertEquals(3, solution.strangePrinter("abab")); // Requires two turns
    }

    @Test
    public void testStrangePrinter_ConsecutiveDuplicates() {
        Sol9 solution = new Sol9();

        // String with consecutive duplicate characters
        assertEquals(3, solution.strangePrinter("aaabbbccc")); // Remove duplicates, then print in turns
    }

    @Test
    public void testStrangePrinter_MixedCharacters() {
        Sol9 solution = new Sol9();

        // Mixed characters
        assertEquals(5, solution.strangePrinter("abcabc")); // Optimize based on split
    }

    @Test
    public void testStrangePrinter_LongString() {
        Sol9 solution = new Sol9();

        // Long non-repeating string
        assertEquals(10, solution.strangePrinter("abcdefghij")); // One turn per character
    }

//    @Test
//    public void testStrangePrinter_EmptyString() {
//        Sol9 solution = new Sol9();
//
//        // Empty string
//        assertEquals(0, solution.strangePrinter("")); // No characters to print
//    }

    @Test
    public void testStrangePrinter_EdgeCase_TwoCharacters() {
        Sol9 solution = new Sol9();

        // Edge case: Two characters
        assertEquals(2, solution.strangePrinter("ab")); // Two turns required
        assertEquals(1, solution.strangePrinter("aa")); // Single turn required
    }

    @Test
    public void testStrangePrinter_EdgeCase_PartialOverlap() {
        Sol9 solution = new Sol9();

        // String with partial overlaps
        assertEquals(2, solution.strangePrinter("aabba")); // Overlaps reduce required turns
    }

    @Test
    public void testStrangePrinter_SpecialCharacters() {
        Sol9 solution = new Sol9();

        // Special characters
        assertEquals(3, solution.strangePrinter("!@!!@")); // Optimizes by reducing duplicates
    }

    @Test
    public void testStrangePrinter_AllUniqueCharacters() {
        Sol9 solution = new Sol9();

        // All unique characters
        assertEquals(5, solution.strangePrinter("abcde")); // Requires one turn per character
    }
}



