/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepath;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Owner
 */
public class Week2 {
    /**
     *
     */
    public int anagramString(String firt, String second) {
        return 0;
    }
    
    public static class LinkedListNode{
        int val;
        LinkedListNode next;
        
        LinkedListNode(int node) {
            val = node;
            next = null;
        }
        
        /**
         * Add value using node
         * @param node
         * @return 
         */
        public boolean addLinkedList(LinkedListNode node) {
            if (node == null) {
                return false;
            }
            this.next = node;
            //add node in here
            return true;
        } 
        
        /**
         * Add value using a value
         * @param value
         * @return 
         */
        public boolean addLinkedList(int value) {
            this.next = new LinkedListNode(value);
        }
    }

    /**
     * Remove the node that is greater than value x
     * @param list
     * @param x
     * @return 
     */
    static LinkedListNode removeNodes(LinkedListNode list, int x) {
        if (list == null) {
            return null;
        }
        
        LinkedListNode cur = list;
        while (cur != null) {
            if (cur.val > x) {
                LinkedListNode next = cur.next;
                if (next == null) {
                    cur.val = 0;
                    cur.next = null;
                }
                else {
                    cur.val = next.val;
                    cur.next = next.next;
                } 
            }
            cur = cur.next;
        }
        return list;

    }
    
    /**
     * Detect the first repeated word in a sentence
     * @param s String to detect
     * @return the repeated word
     */
    static String firstRepeatedWord(String s) {
        String newString = "";
        Set stringSet  = new HashSet();
        for (String sub: s.split("\\s+")) {
            newString = sub;
            if (stringSet.add(newString) == false) {
                return newString;
            }
        }
        return newString;

    }

}
