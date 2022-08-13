package xyz.ventosa.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.ventosa.leetcode.problems.helper.ListNode;

class MergeTwoSortedListsTest {

    ListNode headOne = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode headTwo = new ListNode(1, new ListNode(3, new ListNode(4)));
    ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

    @Test
    void testEquals() {
        Assertions.assertNotEquals(headOne, headTwo);
        Assertions.assertNotEquals(new ListNode(), expected);
        Assertions.assertNotEquals(headOne, expected);
        Assertions.assertEquals(headOne, headOne);
    }

    @Test
    void testMergeOne() {
        Assertions.assertEquals(new MergeTwoSortedLists().mergeTwoLists(headOne, headTwo), expected);
    }

    @Test
    void testMergeTwo() {
        Assertions.assertEquals(new MergeTwoSortedLists().mergeTwoLists(headTwo, headOne), expected);
    }

    @Test
    void testMergeThree() {
        Assertions.assertEquals(new MergeTwoSortedLists().mergeTwoLists(new ListNode(), new ListNode()), new ListNode());
    }

    @Test
    void testMergeFour() {
        Assertions.assertEquals(new MergeTwoSortedLists().mergeTwoLists(new ListNode(1), null), new ListNode(1));
    }

}