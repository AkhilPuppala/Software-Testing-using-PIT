package org.example;


import java.util.*;
import java.lang.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class Sol6Test {

    @Test
    public void testIsMatch() {
        Sol6 solution = new Sol6();

        // Test exact match
        assertTrue(solution.isMatch("abc", "abc"));

        // Test wildcard match (.)
        assertTrue(solution.isMatch("abc", "a.c"));
        assertFalse(solution.isMatch("abc", "a.d"));

        // Test zero or more (*) with preceding character match
        assertTrue(solution.isMatch("aa", "a*"));
        assertTrue(solution.isMatch("aaa", "a*"));
        assertTrue(solution.isMatch("abc", ".*"));
        assertFalse(solution.isMatch("abc", "a*b"));

        // Test pattern with no match
        assertFalse(solution.isMatch("abc", "abd"));
        assertFalse(solution.isMatch("abc", "abcd"));
//        assertFalse(solution.isMatch("", "a*"));

        // Test empty text and pattern
        assertTrue(solution.isMatch("", ""));
        assertFalse(solution.isMatch("a", ""));
        assertFalse(solution.isMatch("", "a"));

        // Test combination of .* and a*
        assertTrue(solution.isMatch("abbb", "ab*"));
        assertTrue(solution.isMatch("abc", ".*c"));
        assertTrue(solution.isMatch("aaa", "a*a"));

        // Test multiple stars and wildcards
        assertFalse(solution.isMatch("mississippi", "mis*is*p*."));
        assertTrue(solution.isMatch("mississippi", "mis*is*ip*."));

        // Test edge cases
        assertFalse(solution.isMatch("a", ".*.."));
        assertTrue(solution.isMatch("ab", ".*..*"));
        assertFalse(solution.isMatch("abcd", ".*c"));
    }
}

