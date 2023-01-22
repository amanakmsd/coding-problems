import helper.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode prev = null;
        ListNode director = head;
        for(int count = 1; count < n ;count++) {
            director= director.next;
        }
        while(director.next!=null) {
            prev = current;
            current = current.next;
            director = director.next;
        }
        if(prev == null) {
            return head.next;
        }
        prev.next = current.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        int[] arr = new int[]{1,2,3,4,5,6,7};
        ListNode current = head;
        for(int num:arr) {
            current.next = new ListNode();
            current = current.next;
            current.val = num;
            current.next = null;
        }
        head = head.next;
        ListNode result = new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 4);
        while(result !=null) {
            System.out.print(result.val+" ");
            result = result.next;
        }

    }
}
