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
public class LeetCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {2, 7, 11, 15};
        //int[] results = SolutionEasy.twoSum(nums, 22);
        //LeetCode.checkArrayContent(results);
        //System.out.println(SolutionMedium.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(SolutionEasy.myAtoi("321"));
        System.out.println(SolutionEasy.myAtoi("321.17"));
    }
    
    public static void checkArrayContent(int[] array) {
        if (array.length != 0) {
            for(int i = 0; i<array.length; i++) {
                System.out.println(array[i]);
            }
        }
        else {
            System.out.print("Can't return answer");
        }
        
    }
    
}
