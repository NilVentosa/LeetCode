package xyz.ventosa.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfWeakCharactersTest {

    NumberOfWeakCharacters n = new NumberOfWeakCharacters();

    @Test
    void numberOfWeakCharacters_one() {
        assertEquals(0, n.numberOfWeakCharacters(new int[][]{{5,5},{6,3},{3,6}}));
    }

    @Test
    void numberOfWeakCharacters_two() {
        assertEquals(1, n.numberOfWeakCharacters(new int[][]{{2,2},{3,3}}));
    }

    @Test
    void numberOfWeakCharacters_three() {
        assertEquals(1, n.numberOfWeakCharacters(new int[][]{{1,5},{10,4},{4,3}}));
    }

    @Test
    void numberOfWeakCharacters_four() {
        assertEquals(6, n.numberOfWeakCharacters(new int[][]{{7,7},{1,2},{9,7},{7,3},{3,10},{9,8},{8,10},{4,3},{1,5},{1,5}}));
    }
    
    
    
    
}