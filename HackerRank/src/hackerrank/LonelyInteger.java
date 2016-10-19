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
public class LonelyInteger {
    static int lonelyInteger(int[] arr) {
        int arrSize = arr.length;
        int[] newArray = new int[101];
        //for(int i = 0; i < SIZE; C[i++] = 0){}
        for (int i = 0; i < arrSize; newArray[arr[i++]]++){
            newArray[arr[i]]++;
        }
        for (int i = 0; i < 101; i++){
            if (newArray[i] == 1){
                return i;
            }
        }
        return -1;
    }
}
