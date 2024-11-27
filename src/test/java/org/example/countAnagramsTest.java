package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class countAnagramsTest {

    @Test
    public void testSingleWord() {
        countanagrams solution = new countanagrams();
        assertEquals(6, solution.countAnagrams("abc")); // Single word with distinct characters
    }

    @Test
    public void testWordWithRepeatedCharacters() {
        countanagrams solution = new countanagrams();
        assertEquals(6, solution.countAnagrams("aabb")); // Word with repeated characters
    }

    @Test
    public void testMultipleWords() {
        countanagrams solution = new countanagrams();
        assertEquals(12, solution.countAnagrams("aabb ab")); // Two words with different anagram counts
    }


    @Test
    public void testWordWithSingleCharacter() {
        countanagrams solution = new countanagrams();
        assertEquals(1, solution.countAnagrams("a")); // Single character, only one permutation
    }

    @Test
    public void testIdenticalWords() {
        countanagrams solution = new countanagrams();
        assertEquals(1, solution.countAnagrams("aaa")); // All characters are the same
    }

    @Test
    public void testLargeWord() {
        countanagrams solution = new countanagrams();
        String word = "a".repeat(1000); // Word with 1000 identical characters
        assertEquals(1, solution.countAnagrams(word)); // Only one permutation is possible
    }

    @Test
    public void testLargeInput() {
        countanagrams solution = new countanagrams();
        String input = "abc ".repeat(1000).trim(); // 1000 identical words
        assertEquals(162017466, solution.countAnagrams(input)); // Modular arithmetic should handle this gracefully
    }

    @Test
    public void testNoAnagrams() {
        countanagrams solution = new countanagrams();
        assertEquals(24, solution.countAnagrams("abcd")); // No repeated characters, 1 valid permutation
    }

    @Test
    public void testAnagramsInMultipleWords() {
        countanagrams solution = new countanagrams();
        assertEquals(36, solution.countAnagrams("aabb bbaa")); // Two words, each with anagram possibilities
    }

    @Test
    public void testSpecialCharacters() {
        countanagrams solution = new countanagrams();
        assertEquals(1, solution.countAnagrams("@@@@")); // Special characters treated the same as letters
    }

    @Test
    public void testCaseSensitivity() {
        countanagrams solution = new countanagrams();
        assertEquals(24, solution.countAnagrams("AaBb")); // Case-sensitive, no additional permutations
    }

    @Test
    public void testFactorialModulus() {
        countanagrams solution = new countanagrams();
        assertEquals(120, solution.countAnagrams("abcde")); // Test correctness of modular arithmetic
    }

    @Test
    public void testMultipleDifferentWords() {
        countanagrams solution = new countanagrams();
        assertEquals(4320, solution.countAnagrams("abc abcde abc")); // Multiple different words, modular arithmetic
    }

    @Test
    public void testLongWordWithRepeatedCharacters() {
        countanagrams solution = new countanagrams();
        assertEquals(2520, solution.countAnagrams("aabbccdd")); // Large word with multiple repetitions
    }

    @Test
    public void testLargeModulus() {
        countanagrams solution = new countanagrams();
        String input = "aabbccdd".repeat(100); // Repeated pattern
        assertTrue(solution.countAnagrams(input) > 0); // Ensure result doesn't overflow
    }
}
