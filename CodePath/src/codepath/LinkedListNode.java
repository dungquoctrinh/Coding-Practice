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
public class LinkedListNode<E> {
    E value;
    LinkedListNode<E> next;
    
    public LinkedListNode(E value)
    {
        this.value = value;
        this.next = null;
    }

    public LinkedListNode() {
        
    }
    
    /**set and gette
     * @return r**/
    public E getValue() 
    {
        return this.value;
    }
    
    public void setValue(E value)
    {
        this.value = value;
    }
    
    /**set/getter for the node**/
    public LinkedListNode<E> getNext()
    {
        return this.next;
    }
    
    public void setNext(LinkedListNode<E> next)
    {
        this.next = next;
    }
    
    /**
     * Initilize the array with the value
     */
    public LinkedListNode<E> setValuesFromArray(E[] listValues)
    {
        LinkedListNode head = new LinkedListNode();
        LinkedListNode cur = null;
        for(int i = 0; i < listValues.length; i++)
        {
            if(i == 0)
            {
                cur = head;
                head.setValue(listValues[i]);
            }
            else 
            {
                LinkedListNode node = new LinkedListNode(listValues[i]);
                cur.setNext(node);
                cur = cur.next;
            }
        }
        return head;
    }
    
    public void checkLinkedList(LinkedListNode<E> head)
    {
        LinkedListNode<E> cur = head;
        while (cur != null)
        {
            System.out.println(cur.getValue());
            cur = cur.next;
        }
    }
}
