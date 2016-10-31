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
            sum += numbers[i];
        }
        return sum;
    }

    /**
     * Return the length of the longest subarray having a sum less or equal to k
     * Input:
     *  1,2,3
     *  k: 4
     * Output:
     *  2
     * @param a
     * @param k
     * @return 
     */
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

    /**
     * Input:
     *  hackerranks
     *  hackers
     * Output:
     *  7
     * @param x
     * @param y
     * @return 
     */
    static int longestSubsequence(String x, String y) {
        char[] A = x.toCharArray();
        char[] B = y.toCharArray();
        int[][] LCS = new int[A.length + 1][B.length + 1];
	String[][] solution = new String[A.length + 1][B.length + 1];
	// if A is null then LCS of A, B =0
	for (int i = 0; i <= B.length; i++) {
		LCS[0][i] = 0;
		solution[0][i] = "0";
	}

	// if B is null then LCS of A, B =0
	for (int i = 0; i <= A.length; i++) {
		LCS[i][0] = 0;
		solution[i][0] = "0";
	}

	for (int i = 1; i <= A.length; i++) {
		for (int j = 1; j <= B.length; j++) {
			if (A[i - 1] == B[j - 1]) {
				LCS[i][j] = LCS[i - 1][j - 1] + 1;
			} else {
				LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
			}
		}
	}
	return LCS[A.length][B.length];
    }
    
   
}
