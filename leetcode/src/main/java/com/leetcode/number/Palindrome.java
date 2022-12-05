package com.leetcode.number;

public class Palindrome {

    private static final int DIVIDER = 10;

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome(101));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % DIVIDER == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            int t = x % DIVIDER;
            x /= DIVIDER;
            revertedNumber = revertedNumber * DIVIDER + t;

        }
        return x == revertedNumber || x == revertedNumber / DIVIDER;
    }
}
