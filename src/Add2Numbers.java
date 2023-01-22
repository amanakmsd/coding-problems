
public class Add2Numbers {
 public static void main(String[] args) {
  int[] arr1 = {9,9,9,9,9,9,9};
  int[] arr2 = {9,9,9,9};
  ListNode head1 = null;
  ListNode cur1 = head1;
  ListNode head2 = null;
  ListNode cur2 = null;
  head1 = new ListNode(arr1[0]);
  cur1 = head1;
  head2 = new ListNode(arr2[0]);
  cur2 = head2;
  for (int i=1;i< arr1.length;i++) {
   cur1.next = new ListNode(arr1[i]);
   cur1 = cur1.next;
  }
  for (int i=1;i< arr2.length;i++) {
   cur2.next = new ListNode(arr2[i]);
   cur2 = cur2.next;
  }

  print(head1);
  System.out.println();
  print(head2);
  ListNode result = new Add2Numbers().addTwoNumbers(head1, head2);
  System.out.println();
  print(result);


 }

 public static void print(ListNode result) {
  while(result!=null) {
   System.out.print(result.val+ " ");
   result = result.next;
  }
 }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode cur1 = l1;
     ListNode cur2 = l2;
     ListNode head3 = null;
     ListNode cur3 = head3;
     int carry = 0;
     while (cur1 != null || cur2 != null) {
      int sum = 0;
      if (cur1 != null && cur2 != null) {
       sum = (cur1.val + cur2.val + carry);
       carry = sum / 10;
       sum = sum % 10;
       if (cur3 == null) {
        cur3 = new ListNode(sum, null);
        head3 = cur3;
       } else {
        cur3.next = new ListNode(sum);
        cur3 = cur3.next;
       }
       cur1 = cur1.next;
       cur2 = cur2.next;
      } else if (cur1 != null && cur2 == null) {
       sum = cur1.val + carry;
       carry = sum / 10;
       sum = sum % 10;
       cur3.next = new ListNode(sum);
       cur3 = cur3.next;
       cur1 = cur1.next;
      } else if (cur2 != null && cur1 == null) {
       sum = cur2.val + carry;
       carry = sum / 10;
       sum = sum % 10;
       cur3.next = new ListNode(sum);
       cur3 = cur3.next;
       cur2 = cur2.next;
      }
     }
     if (carry > 0) {
      cur3.next = new ListNode(carry);
     }
     return head3;
    }
}
