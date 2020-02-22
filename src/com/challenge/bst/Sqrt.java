package com.challenge.bst;

import java.math.BigInteger;

/** Implement int sqrt(int x).

        Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

        Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

        Example 1:

        Input: 4
        Output: 2
        Example 2:

        Input: 8
        Output: 2
        Explanation: The square root of 8 is 2.82842..., and since
        the decimal part is truncated, 2 is returned. **/

public class Sqrt {

    public static int squareRoot(int x) {
        int start = 0, ans = 0;
        int end = x/2;

        if(x == 0 || x == 1) return x;
        if (x < 0) return -1;

        int mid = start+(end-start)/2;

        while (start<=end) {

            if(mid == x/mid) return mid;

            if (mid > x/mid) {
                end = mid-1;
            } else {
                start = mid+1;
                ans = mid;
            }
            mid = start+(end-start)/2;

        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(squareRoot(2147395599));
    }
}