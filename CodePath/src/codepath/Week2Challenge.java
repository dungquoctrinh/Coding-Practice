/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepath;

/**
 *
 * @author Owner
 */
public class Week2Challenge {
    public static LinkedListNode<Integer> LinkedListreverseIntegerList(int number)
    {
        LinkedListNode<Integer> head = new LinkedListNode<>();
        LinkedListNode<Integer> cur = head;
        int digit = 0;
        while(number > 0)
        {
            digit = number%10;
            number = number/10;
            LinkedListNode<Integer> node = new LinkedListNode<>(digit);
            cur.setNext(node);
            cur = cur.next;
        }
        
        return head.next;
    }
    
    /**
     * Add two linked list together
     * @param list1
     * @param list2
     * @return 
     */
    public LinkedListNode<Integer> addLinkedList(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2)
    {
        return null;
    }
}
