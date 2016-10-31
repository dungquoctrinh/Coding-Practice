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
public class Subsequence {
    static int maxLength(int[] a, int k) {
        int[][] subArraySums = new int[k][k];//store sums from index [i][j] in here
        int maxLength = 0;

        for (int i = 0; i < k; i++) {
            for (int j = i; j < k; j++) {
                if (i == j) {
                    subArraySums[i][j] = a[i];
                } else {
                    subArraySums[i][j] = subArraySums[i][j - 1] + a[j];
                }

                //because initially maxLength was set to 0
                if (subArraySums[i][j] <= k && maxLength <= j - i) {
                    maxLength = j - i + 1;
                }
            }
        }
        return maxLength;
    }
}
