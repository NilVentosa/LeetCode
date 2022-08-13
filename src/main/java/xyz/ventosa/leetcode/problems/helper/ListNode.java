package xyz.ventosa.leetcode.problems.helper;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) return false;

        ListNode currentThis = this;

        while (currentThis != null && obj != null) {
            if (currentThis.val != ((ListNode) obj).val) {
                return false;
            }
            currentThis = currentThis.next;
            obj = ((ListNode) obj).next;
        }

        return true;
    }

    @Override
    public String toString() {
        ListNode currentNode = this;
        StringBuilder str = new StringBuilder();
        str.append("[");
        str.append(currentNode.val);
        while (currentNode.next != null) {
            str.append(",");
            str.append(currentNode.next.val);
            currentNode = currentNode.next;
        }
        str.append("]");
        return str.toString();
    }
}