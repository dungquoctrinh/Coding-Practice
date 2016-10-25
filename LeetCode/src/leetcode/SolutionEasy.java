/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Owner
 */
public class SolutionEasy {
    /**
     * Given an array of integers, return indices of the two numbers such 
     * that they add up to a specific target.
     * @param nums
     * @param target
     * @return 
     * Given nums = [2, 7, 11, 15], target = 9,
     * return [0, 1].
     */
    public static int[] twoSum(int[] nums, int target) {
        //iint[2] returnArrayn;
        for(int i = 0; i < nums.length-1; i++) {
            for (int j = i +1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    int[] results = {i, j};
                    return results;
                }
            }
        }
        return null;
    }
    
    /**
     * https://leetcode.com/problems/zigzag-conversion/
     * @param s
     * @param numRows
     * @return 
     */
    public String convert(String s, int numRows) {
        return "";
    }
    
    /**
     * Reverse digits of an integer.
     * @param x
     * @return 
     */
    public int reverse(int x) {
        return 0;
    }
    
    /**
     * Implement atoi to convert a string to an integer.
     * @param str
     * @return 
     */
    public int myAtoi(String str) {
        return 0;
    }
    
    /**
     * Determine whether an integer is a palindrome. Do this without extra space.
     */
    public boolean isPalindrome(int x) {
        return true;
    }
}
