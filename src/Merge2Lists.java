
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Merge2Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head1 = list1;
        ListNode head2 = list2;

        if(head1 == null)
            return head2;
        if(head2 == null)
            return head1;
        ListNode head;
        if(head1.val <= head2.val) {
            head = new ListNode(head1.val);
            head1 = head1.next;
        } else {
            head = new ListNode(head2.val);
            head2 = head2.next;
        }

        head.next = mergeTwoLists(head1, head2);
        return head;
    }

    public static void main(String[] args) {
    }
}