/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepath;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Week1 {
    
    /**
     * checking if an string is a palindrome
     * Ex:
     *  "A man, a plan, a canal:Panama" return True
     *  "race a car" return False
     */
    public static boolean checkPalindrome(String s) 
    {
        s = s.toUpperCase().replaceAll("\\s+","").replaceAll("[^a-zA-Z]", "");        
        int n = s.length();
        if (n==1) {
            return true;
        }
        
        //go from both end to check
        for (int i=0;i<(n / 2);i++) 
        {
            if (s.charAt(i) != s.charAt(n - i - 1)) 
            {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Delete duplicate from a a sorted array
     * @return size Number of non duplicate number
     */
    public static int deleteDuplicate(int[] arrayNumber) {
        int curNumber = 0;
        int size = arrayNumber.length;
        if (arrayNumber.length < 1) {
            return arrayNumber.length;
        }
        
        for (int i = curNumber+1; i < arrayNumber.length; i++) {
            if ((arrayNumber[curNumber]^arrayNumber[i]) == 0 ) {
                arrayNumber[i] = 0;
                size-=1;
            }
            else {
                curNumber = i;
             
            }
        }
        
        //reset curNumber
        curNumber = 0;
        for (int i = 0; i < arrayNumber.length; i ++) {
            if(arrayNumber[i] != 0) {
                arrayNumber[curNumber] = arrayNumber[i];
                if (curNumber != i) {
                    arrayNumber[i] = 0;
                }
                curNumber+=1;
            }
        }
   
        //print number in order
        for (int i = 0; i < arrayNumber.length; i ++) {
            System.out.print(arrayNumber[i]);
        }
        return size;
    }
    
    /**
     * Return the array of all prime that is smaller than n 
     * @param n the interger 
     * @return 
     */
    public static ArrayList<Integer> getPrime(int n) {
        
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        
        for (int i = 1; i < n ; i++) {
            if(isPrime(i) == true) {
                newArray.add(i);
            }
        }
        return newArray;
    }
    
    //checks whether an int is prime or not.
    public static boolean isPrime(int n) {
        if (n <=2) 
            return true;
        //check if n is a multiple of 2
        if (n%2==0) 
            return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) 
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    /**
     * The longest palindromic substring 
     * @param theString
     * @return 
     */
    public static String longestPalindrome(String theString) {
        String curString = theString.substring(0);
        int size = curString.length();
        for(int i = 1; i < theString.length(); i++) {
            
        }
        return null;
    }
}
