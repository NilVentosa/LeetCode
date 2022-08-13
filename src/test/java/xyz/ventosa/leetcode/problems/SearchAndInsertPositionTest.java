package xyz.ventosa.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchAndInsertPositionTest {

    @Test
    void searchInsertOne() {
        Assertions.assertEquals(2, new SearchAndInsertPosition().searchInsert(new int[]{1,3,5,6}, 5));
    }
    @Test
    void searchInsertTwo() {
        Assertions.assertEquals(1, new SearchAndInsertPosition().searchInsert(new int[]{1,3,5,6}, 2));
    }
    @Test
    void searchInsertThree() {
        Assertions.assertEquals(4, new SearchAndInsertPosition().searchInsert(new int[]{1,3,5,6}, 7));
    }
}