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
public class Week4 {
    /**
     * The factorial of n is the product between 1 to n
     * @param n
     * @return 
     */
    public static java.math.BigInteger factorialNumber(java.math.BigInteger n) {
        return null;
    }
    
    
    public static int gdcFinder(int a, int b) {
        return 0;
    }
    
    /**
     * Return the array of all possible substring
     * @param s
     * @return 
     */
    public static ArrayList<String> getSubstring(String s) {
        return null;
    }
    
    /*
    * Complete the function below.
    k = 4
    1
    1 1
    1 2 1
    1 3 3 1
    */
    static void pascalTriangle(int k) 
    {
        int[] previousRow;
        int[] currentRow = {1};
        printArray(currentRow);
        previousRow = currentRow;
        for (int i = 2; i <= k; i++) {
            currentRow = new int[i];
            currentRow[0] = 1;
            currentRow[i - 1] = 1;
            for (int j = 0; j <= i - 3; j++) {
                currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
            }
            printArray(currentRow);
            previousRow = currentRow;
        }
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    /*
    * Combination to convert (a,b) to (c,d)
    * add the number to change the number
    */
    static String isPossible(int a, int b, int c, int d) {
        if (a > c || b > d)  
        {
            return "No";
        }
        if (a == c && b == d)
        {
            return "Yes";
        }
        if (a < c)
        {
            return isPossible(a+b, b, c, d);
        }
        return isPossible(a, b + a, c, d);
    }
    
    /*
    * Return number of path to get out of the array
    * 1 means move
    * 0 mean stuck
    * 1 0
    * 1 1
    */
    static int numberOfPaths(int[][] a) {

        return 0;
    }
}
