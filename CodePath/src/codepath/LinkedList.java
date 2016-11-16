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
public class LinkedList<E> implements LinkedListNode{
    E value;
    LinkedList<E> next;
    
    public LinkedList(E val) {
        this.value = val;
        next = null;
    }
    @Override
    public Object getValue() {
       return (E)value;
    }

    @Override
    public void setValue(Object value) {
        this.value = (E)value;
    }

    @Override
    public LinkedList<E> getNext() {
        return (LinkedList<E>)this.next;
    }

    @Override
    public void setValuesFromArray(Object[] listValue) {
        for (int i = 0; i < listValue.length; i++) {
            if(i == 0) {
                LinkedList<E> head = new LinkedList<E>((E)listValue[i]);
            }
        }
    }

    @Override
    public void setNext(LinkedListNode next) {
        this.next = (LinkedList<E>) next;
    }
}
