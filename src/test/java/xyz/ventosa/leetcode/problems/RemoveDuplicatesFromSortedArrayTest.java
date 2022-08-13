package xyz.ventosa.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicatesOne() {
        Assertions.assertEquals(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1,1,2,3,4,4,5}), 5);
    }

}