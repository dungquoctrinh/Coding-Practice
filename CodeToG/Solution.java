class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i ++)
        {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++)
            {
                int second = nums[j];
                if (first + second == target)
                {
                    result[0] = i;
                    result[1] = j;
                    break;
                    
                }
            }
        }
        return result;
    }

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
                cur = cur.next;
            }

            sum = sum - curVal;
            if (sum != 0)
            {
                sum /= 10;
            }
        }
        return result;

        // ListNode dummyHead = new ListNode(0);
        // ListNode p = l1, q = l2, curr = dummyHead;
        // int carry = 0;
        // while (p != null || q != null) {
        //     int x = (p != null) ? p.val : 0;
        //     int y = (q != null) ? q.val : 0;
        //     int sum = carry + x + y;
        //     carry = sum / 10;
        //     curr.next = new ListNode(sum % 10);
        //     curr = curr.next;
        //     if (p != null) p = p.next;
        //     if (q != null) q = q.next;
        // }
        // if (carry > 0) {
        //     curr.next = new ListNode(carry);
        // }
        // return dummyHead.next;
    }
}