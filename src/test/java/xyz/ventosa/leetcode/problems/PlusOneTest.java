package xyz.ventosa.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PlusOneTest {

    @Test
    void plusOneOne() {
        Assertions.assertTrue(Arrays.equals(new int[]{1,0}, new PlusOne().plusOne(new int[]{9})));
    }

    @Test
    void plusOneTwo() {
        Assertions.assertTrue(Arrays.equals(new int[]{1,0,0}, new PlusOne().plusOne(new int[]{9,9})));
    }

    @Test
    void plusOneThree() {
        Assertions.assertTrue(Arrays.equals(new int[]{1}, new PlusOne().plusOne(new int[]{0})));
    }

    @Test
    void plusOneFour() {
        Assertions.assertTrue(Arrays.equals(new int[]{1,2}, new PlusOne().plusOne(new int[]{1,1})));
    }

    @Test
    void plusOneFive() {
        Assertions.assertTrue(Arrays.equals(new int[]{3,0}, new PlusOne().plusOne(new int[]{2,9})));
    }

    @Test
    void plusOneSix() {
        Assertions.assertTrue(Arrays.equals(new int[]{9,9,0}, new PlusOne().plusOne(new int[]{9,8,9})));
    }
}