/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Owner
 */
public class ArraySum {
    static int sum(int[] numbers) {
        int count = numbers.length;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum+= numbers[i];
        }
        return sum;
    }   
}
