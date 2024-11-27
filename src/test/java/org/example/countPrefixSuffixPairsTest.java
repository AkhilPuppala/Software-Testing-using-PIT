package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class countPrefixSuffixPairsTest {

    @Test
    public void testBasicCase() {
        countPrefix solution = new countPrefix();
        String[] words = {"abc", "abcabc", "abc"};
        assertEquals(2, solution.countPrefixSuffixPairs(words)); // Prefix and suffix matches found.
    }

    @Test
    public void testEmptyArray() {
        countPrefix solution = new countPrefix();
        String[] words = {};
        assertEquals(0, solution.countPrefixSuffixPairs(words)); // No words to check.
    }

    @Test
    public void testSingleWord() {
        countPrefix solution = new countPrefix();
        String[] words = {"abc"};
        assertEquals(0, solution.countPrefixSuffixPairs(words)); // Only one word, no pairs.
    }

    @Test
    public void testNoMatches() {
        countPrefix solution = new countPrefix();
        String[] words = {"abc", "def", "ghi"};
        assertEquals(0, solution.countPrefixSuffixPairs(words)); // No prefix-suffix matches.
    }

    @Test
    public void testExactMatches() {
        countPrefix solution = new countPrefix();
        String[] words = {"abc", "abc", "abc"};
        assertEquals(3, solution.countPrefixSuffixPairs(words)); // All words are exact matches.
    }

    @Test
    public void testDifferentLengths() {
        countPrefix solution = new countPrefix();
        String[] words = {"a", "aa", "aaa", "aaaa"};
        assertEquals(6, solution.countPrefixSuffixPairs(words)); // Multiple matches with different lengths.
    }

    @Test
    public void testDuplicateWords() {
        countPrefix solution = new countPrefix();
        String[] words = {"abc", "abcabc", "abc", "abc"};
        assertEquals(4, solution.countPrefixSuffixPairs(words)); // Check handling of duplicates.
    }

    @Test
    public void testSubsetPrefixesAndSuffixes() {
        countPrefix solution = new countPrefix();
        String[] words = {"abc", "abcd", "dabc", "abcdabc"};
        assertEquals(1, solution.countPrefixSuffixPairs(words)); // Partial matches for prefix-suffix.
    }

    @Test
    public void testWordsWithOverlap() {
        countPrefix solution = new countPrefix();
        String[] words = {"abab", "abababab", "abab"};
        assertEquals(2, solution.countPrefixSuffixPairs(words)); // Overlapping prefix and suffix cases.
    }

    @Test
    public void testCaseSensitivity() {
        countPrefix solution = new countPrefix();
        String[] words = {"abc", "Abc", "abcabc", "ABC"};
        assertEquals(1, solution.countPrefixSuffixPairs(words)); // Verify case sensitivity.
    }

    @Test
    public void testLongWords() {
        countPrefix solution = new countPrefix();
        String[] words = {"abcdefgh", "abcdefghabcdefgh", "abcdefgh"};
        assertEquals(2, solution.countPrefixSuffixPairs(words)); // Long words with prefix-suffix matches.
    }

    @Test
    public void testPartialPrefixMatchOnly() {
        countPrefix solution = new countPrefix();
        String[] words = {"abc", "abcd", "abcabc", "def"};
        assertEquals(1, solution.countPrefixSuffixPairs(words)); // Match only as a prefix.
    }

    @Test
    public void testPartialSuffixMatchOnly() {
        countPrefix solution = new countPrefix();
        String[] words = {"abc", "dabc", "efgabc", "abcabc"};
        assertEquals(1, solution.countPrefixSuffixPairs(words)); // Match only as a suffix.
    }

    @Test
    public void testComplexMatch() {
        countPrefix solution = new countPrefix();
        String[] words = {"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa"};
        assertEquals(15, solution.countPrefixSuffixPairs(words)); // Complex case with multiple lengths.
    }

    @Test
    public void testEmptyStrings() {
        countPrefix solution = new countPrefix();
        String[] words = {"", "", ""};
        assertEquals(3, solution.countPrefixSuffixPairs(words)); // Empty strings should not match.
    }
}
