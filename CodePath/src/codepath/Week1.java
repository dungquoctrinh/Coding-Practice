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
        if (theString == null || theString.length() == 0)
        {
            return null;
        }
        if (theString.length() == 1)
        {
            return theString;
        }
        
        int maxLength = 0;
        String longestString = "";
        
        int size = theString.length();
        //table contain the letter
        int[][] table = new int[size][size];
        
        //the position at a has lenghth equal 1
        for(int i = 0; i < size; i++)
        {
            table[i][i] = 1;
        }
        
        //DEBUG: 
        printTable(table);
        
        //two consecutive letter if the same is the palindrome
        //Ex: aa
        for (int i = 0; i <= size - 2; i++)
        {
            if(theString.charAt(i) == theString.charAt(i+1))
            {
                table[i][i+1] = 1;
                longestString = theString.substring(i, i+2);
            }
        }
        //DEBUG: printTable(table);
        
        //l is the jump rang
        for (int l = 2; l <= size - 1; l++)
        {
            for (int i = 0; i < size - 3; i++)
            {
                int j = i + l;
                if(theString.charAt(i) == theString.charAt(j))
                {
                    table[i][j] = table[i + 1][j-1];
                    if(table[i][j] == 1 && 1 > maxLength)
                    {
                        longestString = theString.substring(i, j+1);
                    }
                }
                else
                {
                    table[i][j] = 0;
                }
                //DEBUG: 
                printTable(table);
            }
        }
        return longestString;
    }
    
    /**
     * Helper function to print the result from the matrix
     * @param matrix 
     */
    public static void printTable(int[][] matrix)
    {
        for (int[]y : matrix)
        {
            for(int z:y)
            {
                System.out.print(z);
            }
            System.out.println();
        }    
        System.out.println("------------------");
    }
    
    public static int goldStar(int[] child) {
        int sumStar = 0;
        int star[] = new int[child.length];
        //assign 1 star per child
        for(int i = 0; i < child.length; i++) {
            if(i==0) {
                if(child[i] > child[i+1]) {
                    star[i] +=1;
                }
            }
            else if (i != child.length - 1) {
                if (child[i] > child[i+1] || child[i] > child[i-1]) {
                    star[i] +=1;
                }
            }
            else {
                if (child[i] > child[i-1]) {
                    star[i] +=1;
                }
            }
        }
        
        for (int i = 0; i< star.length; i++) {
            sumStar+= star[i];
        }
        
        
        return sumStar + star.length;
    }
    
    /**
     * Take int[][] and return array in spiral order 
     * Ex:
     *      int[][]matrix = {{1,2,3}, {4,5,6}, {7,8,9}}
     * return int[] = {1,2,3,6,9,8,7,4,5}
     * @param input
     * @return 
     */
    public static int[] spiralOrder(int[][] matrix)
    {
        
        return null;
    }
}
