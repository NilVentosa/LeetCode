package xyz.ventosa.leetcode.problems;

import xyz.ventosa.leetcode.problems.helper.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode resultHead = new ListNode();

        if (list1.val < list2.val) {
            resultHead.val = list1.val;
            list1 = list1.next;
        } else {
            resultHead.val = list2.val;
            list2 = list2.next;
        }
        ListNode current = resultHead;

        while(list1 != null || list2 != null) {
            if (list1 == null) {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            } else if (list2 == null) {
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            } else {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            }
        }

        return resultHead;
    }
}
