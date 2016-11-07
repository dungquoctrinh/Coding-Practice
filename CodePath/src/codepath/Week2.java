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
    }
    /*
    * Complete the function below.
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
