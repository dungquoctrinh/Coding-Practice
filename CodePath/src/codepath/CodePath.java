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
public class CodePath {

    public static void UpDown(int[] nums) {
        int up = 0, down = 0;
        boolean UP = false;
        boolean DOWN = false;
        //interate the array
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1] && UP == false) {
                up+=1;
                UP = true;
                DOWN = false;
            }
            else if (nums[i] > nums[i + 1] && DOWN == false) {
                down+=1;
                DOWN = true;
                UP = false;
            }
        }
        System.out.println("Up " + up + ",Down " + down);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {2, 3, 5, 5, 7, 11, 11, 11, 11, 13};
        int[] nums = {1, 2, 3, 5, 7, 1, 3, 6, 7, 5, 3};
        //int[] nums = {1,2,3};

        // System.out.println(Week1.checkPalindrome("A man, a plan, a canal: panama"));
        //System.out.println("\n" + Week1.deleteDuplicate(array));
        //System.out.println(Week1.getPrime(8));
        UpDown(nums);
    }

}
