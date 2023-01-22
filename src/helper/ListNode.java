package helper;

public class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(ListNode copy) {
                val = copy.val;
                next = copy.next;
        }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
