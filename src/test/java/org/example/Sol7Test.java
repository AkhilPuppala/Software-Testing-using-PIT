package org.example;

import java.util.*;
import java.lang.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class Sol7Test {

    @Test
    public void testLadderLength_BasicFunctionality() {
        Sol7 solution = new Sol7();

        // Basic functionality: typical case
        List<String> wordList1 = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        assertEquals(5, solution.ladderLength("hit", "cog", wordList1));

        // Case where no transformation is possible
        List<String> wordList2 = Arrays.asList("hot", "dot", "dog", "lot", "log");
        assertEquals(0, solution.ladderLength("hit", "cog", wordList2));

        List<String> wordList3 = Arrays.asList("hot", "dot", "tog", "cog");
        assertEquals(0, solution.ladderLength("hit", "cog", wordList2));
    }

    @Test
    public void testLadderLength_SingleStep() {
        Sol7 solution = new Sol7();

        // Single-step transformation
        List<String> wordList = Arrays.asList("hot");
        assertEquals(2, solution.ladderLength("hit", "hot", wordList));
    }

    @Test
    public void testLadderLength_DirectMatch() {
        Sol7 solution = new Sol7();

        // Start and end words are already the same
        List<String> wordList = Arrays.asList("hit");
        assertEquals(1, solution.ladderLength("hit", "hit", wordList));
    }

    @Test
    public void testLadderLength_EmptyWordList() {
        Sol7 solution = new Sol7();

        // Empty word list
        List<String> wordList = new ArrayList<>();
        assertEquals(0, solution.ladderLength("hit", "cog", wordList));
    }

    @Test
    public void testLadderLength_NoConnection() {
        Sol7 solution = new Sol7();

        // No connection between beginWord and endWord
        List<String> wordList = Arrays.asList("abc", "def", "ghi");
        assertEquals(0, solution.ladderLength("hit", "cog", wordList));
    }

    @Test
    public void testLadderLength_LargeInput() {
        Sol7 solution = new Sol7();

        // Large input case
        List<String> wordList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            wordList.add("word" + i);
        }
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("cog");

        assertEquals(5, solution.ladderLength("hit", "cog", wordList));
    }

    @Test
    public void testLadderLength_UnreachableEndWord() {
        Sol7 solution = new Sol7();

        // End word not in the word list
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        assertEquals(0, solution.ladderLength("hit", "cog", wordList));
    }

    @Test
    public void testLadderLength_CaseWithCycles() {
        Sol7 solution = new Sol7();

        // Case with cycles in the transformation graph
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "hog");
        assertEquals(4, solution.ladderLength("hit", "dog", wordList));
    }

    @Test
    public void testLadderLength_EdgeCase_SingleLetterWords() {
        Sol7 solution = new Sol7();

        // Single-letter words
        List<String> wordList = Arrays.asList("a", "b", "c");
        assertEquals(2, solution.ladderLength("a", "c", wordList));
    }

    @Test
    public void testLadderLength_AllIdenticalWords() {
        Sol7 solution = new Sol7();

        // All words are identical
        List<String> wordList = Arrays.asList("aaa", "aaa", "aaa");
        assertEquals(0, solution.ladderLength("aaa", "bbb", wordList));
    }
}
