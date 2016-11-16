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
public class TreeNode<E>{
    E value; 
    TreeNode<E> left, right;
    public TreeNode(E value) {
        this.value = value;
        this.left = right = null;
    }    
}
