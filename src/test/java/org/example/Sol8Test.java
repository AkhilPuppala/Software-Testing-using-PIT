package org.example;

import java.util.*;
import java.lang.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Sol8Test {

    @Test
    public void testShortestPalindrome_BasicFunctionality() {
        Sol8 solution = new Sol8();

        // Basic palindrome cases
        assertEquals("aba", solution.shortestPalindrome("aba")); // Already a palindrome
        assertEquals("aaacecaaa", solution.shortestPalindrome("acecaaa")); // Add reversed suffix
    }

    @Test
    public void testShortestPalindrome_EmptyString() {
        Sol8 solution = new Sol8();

        // Edge case: Empty string
        assertEquals("", solution.shortestPalindrome("")); // No modification needed
    }

    @Test
    public void testShortestPalindrome_SingleCharacter() {
        Sol8 solution = new Sol8();

        // Edge case: Single character
        assertEquals("a", solution.shortestPalindrome("a")); // Already a palindrome
    }

    @Test
    public void testShortestPalindrome_FullNonPalindrome() {
        Sol8 solution = new Sol8();

        // Fully non-palindromic string
        assertEquals("dcbabcd", solution.shortestPalindrome("abcd")); // Add entire reversed string
    }

    @Test
    public void testShortestPalindrome_AlreadyPalindrome() {
        Sol8 solution = new Sol8();

        // String is already a palindrome
        assertEquals("racecar", solution.shortestPalindrome("racecar")); // No modification needed
    }

    @Test
    public void testShortestPalindrome_AllSameCharacters() {
        Sol8 solution = new Sol8();

        // All characters are the same
        assertEquals("aaaaa", solution.shortestPalindrome("aaaaa")); // No modification needed
    }

    @Test
    public void testShortestPalindrome_SpecialCharacters() {
        Sol8 solution = new Sol8();
        // String with special characters
        assertEquals("!a!a!", solution.shortestPalindrome("a!a!")); // Add reversed suffix
    }

    @Test
    public void testShortestPalindrome_LongString() {
        Sol8 solution = new Sol8();

        // Long non-palindromic string
        assertEquals("hgfedcbabcdefgh", solution.shortestPalindrome("abcdefgh")); // Add reversed prefix
    }

    @Test
    public void testShortestPalindrome_PartialPalindromeAtStart() {
        Sol8 solution = new Sol8();

        // String with a partial palindrome at the start
        assertEquals("cbaabc", solution.shortestPalindrome("cbaabc")); // Add reversed prefix
    }

    @Test
    public void testShortestPalindrome_PalindromeWithSeparators() {
        Sol8 solution = new Sol8();

        // String with separators and partial palindrome
        assertEquals("ab#ba", solution.shortestPalindrome("#ba")); // Add reversed prefix
    }
}

