/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 * Contain the solution for Euler problem from 1-5
 * @author juntrinh
 */
public class Set1 {
    /**
     * Problem 1
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
     * we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
     * @param number The actual number to test with
     */
    public static int sumMultipleThreeFive(int number) {
        int sum = 0;
        int countNumber = 0;
        //while the number is smaller than limited number
        while(countNumber < number) {
            if ((countNumber%3==0) || (countNumber%5==0)) {
                sum+=countNumber;
            }
            countNumber++;
        }
        return sum;   
    }
    
    /**
     * Problem 2
     * By considering the terms in the Fibonacci sequence 
     * whose values do not exceed four million, 
     * find the sum of the even-valued terms.
     */
    public static int sumFibonaccciEven() {
        return 0;
    }
    
    /**
     * Problem 3
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143 ?
     */
    public static int maxPrimeFactor() {
        return 0;
    }
    
    /**
     * Problem 4
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static int maxPalindromeNumber() {
        return 0;
    }
    
    /**
     * Problem 5
     * 2520 is the smallest number that can be divided by each of 
     * the numbers from 1 to 10 without any remainder.
     * What is the smallest positive number that is evenly 
     * divisible by all of the numbers from 1 to 20?
     */
    public static int minDivdedNumber() {
        return 0;
    } 
}
