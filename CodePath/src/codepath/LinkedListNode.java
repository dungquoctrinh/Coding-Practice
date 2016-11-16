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
public interface LinkedListNode<E>{
    E getValue();
    void setValue(E value);
    
    LinkedListNode<E> getNext();
    void setNext(LinkedListNode<E> next);
    
    void setValuesFromArray(E[] listValue);
    
}
