
 //Definition for singly-linked list.
 public class ListNode {
      int val;
      ListNode next = null;
      ListNode(int x) { val = x; }

      public void addListNode(int x)
      {
            this.next = new ListNode(x);   
            this.next.next = null;

      }
}
