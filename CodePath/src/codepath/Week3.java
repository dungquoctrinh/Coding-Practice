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
public class Week3 {
    
    static TreeNode<Integer> root = null;
    public static int counter = 0;
    /**
     * Check if the tree is a binary search tree
     * @param node
     * @return 
     */
    public static boolean checkBinaryTree(TreeNode<Integer> node) {
        return true;
    }
    
    /**
     * 
     * @param root
     * @return rootCount represent the number of nodes 
     * in the tree with same node values
     */
    public static int countNode(TreeNode<Integer> root) {
        return 0;
    }
    
    /*
    * Complete the function below.
    */
    static void createBST(int[] keys) {
        counter = 0;
        TreeNode<Integer> root = null;
        for (int i = 0; i < keys.length; i ++) {
            if (root != null) {
                insert(root, keys[i]);
            }
            else {
                root = new TreeNode(keys[i]);
            }
            System.out.println(counter);
        }
        
    }
    
    static void insert(TreeNode<Integer> root, int key) {
        counter++;
        if (key < (int)root.value) {
            if (root.left == null) {
                root.left = new TreeNode<Integer>(key);
            }
            else {
                insert(root.left, key);
            }
        }
        else {
            if(root.right == null) {
                //create new node with value key
                root.right = new TreeNode<Integer>(key);
            }
            else {
                insert(root.right, key);
            }
        }
    }
}
