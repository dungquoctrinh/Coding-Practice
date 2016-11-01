package leetcode;

import java.util.HashSet;

/**
 *
 * @author Owner
 */
public class SolutionMedium {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * You are given two linked lists representing two non-negative numbers. The
     * digits are stored in reverse order and each of their nodes contain a
     * single digit. Add the two numbers and return it as a linked list. Input:
     * (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    /**
     * Given a string, find the length of the longest substring without
     * repeating characters. Given "abcabcbb", the answer is "abc", which the
     * length is 3. Given "bbbbb", the answer is "b", with the length of 1.
     * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
     * answer must be a substring, "pwke" is a subsequence and not a substring
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int start = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //not in set
            if (!set.contains(c)) 
            {
                //add to set
                set.add(c);
                max = Math.max(max, i - start + 1);
            } 
            else {
                for (int j = start; j < i; j++) {
                    set.remove(s.charAt(j));

                    if (s.charAt(j) == c) {
                        start = j + 1;
                        break;
                    }
                }

                set.add(c);
            }
        }

        return max;
    }

    /**
     * Given a string S, find the longest palindromic substring in S. You may
     * assume that the maximum length of S is 1000, and there exists one unique
     * longest palindromic substring.
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        return "";
    }

    /**
     * Implement myPow
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        return 0;
    }
}
