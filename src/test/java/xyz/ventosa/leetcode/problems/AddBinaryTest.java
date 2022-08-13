package xyz.ventosa.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void addBinary() {
        assertEquals("100", new AddBinary().addBinary("11", "1"));
    }

    @Test
    void addBinary_one() {
        assertEquals("10101", new AddBinary().addBinary("1010", "1011"));
    }

    @Test
    void addBinary_two() {
        assertEquals("0", new AddBinary().addBinary("", ""));
    }

    @Test
    void addBinary_three() {
        assertEquals("1", new AddBinary().addBinary("1", "0"));
    }

    @Test
    void addBinary_four() {
        assertEquals("10", new AddBinary().addBinary("1", "1"));
    }

    @Test
    void addBinary_five() {
        assertEquals("1", new AddBinary().addBinary("1", ""));
    }

    @Test
    void addBinary_six() {
        assertEquals("11110", new AddBinary().addBinary("1111", "1111"));
    }
}