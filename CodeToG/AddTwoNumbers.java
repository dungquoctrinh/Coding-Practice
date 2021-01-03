// You are given two non-empty linked lists representing two non-negative integers. 
// The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
// Explanation: 342 + 465 = 807.
class addTwoNumbersS {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode cur = null;
        int counter = 1;
        int sum = 0;
        int curVal = 0;

        while (l1 != null || l2.next != null)
        {
            if (l1 != null)
            {
                sum += l1.val * counter;
            }

            if (l2 != null)
            {
                sum += l2.val * counter;
            }

            counter = counter * 10;
            if (l1 != null)
            {
                l1 = l1.next;
            }

            if(l2 != null)
            {
                l2 = l2.next;
            }
        }
        
        counter = 10;
        while (sum != 0)
        {
            curVal = sum%10;
            if (result == null)
            {
                result = new ListNode(curVal);
                cur = result;
            }
            else{
                cur.next = new ListNode(curval);
            }
            sum = sum - curVal;
            if (sum != 0)
            {
                sum /= 10;
            }
        }
        return result;
    }
}