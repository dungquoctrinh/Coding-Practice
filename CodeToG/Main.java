import java.util.*;

class MainApplication {
    public static void main(String[] args) {
        System.out.println("test");
        // int[] numbers = new int[] {1,2,3,4,5,6,9};
        // int sum = 4;
        Solution sl = new Solution();
        // int[] results = sl.twoSum(numbers, sum);
        // for (int i = 0; i < results.length ; i++)
        // {
        //     System.out.println(results[i]);
        // }
        
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        ListNode l3 = sl.addTwoNumbers(l1,l2);
        while (l3 != null)
        {
            System.out.println(l3.val);
            l3 = l3.next;
        }
        
    }
}
