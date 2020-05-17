package com.challenge.window;

/*

Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.

Example 1:
Input: [1,0,1,1,0]
Output: 4
Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
    After flipping, the maximum number of consecutive 1s is 4.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
Follow up:
What if the input numbers come in one by one as an infinite stream? In other words, you can't store all numbers coming from the stream as it's too large to hold in memory. Could you solve it efficiently?

 */

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int zero = 0;
        int start = 0;
        int maxFlip = 1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) zero++;

            while (zero>maxFlip) {
                if(nums[start++] == 0) zero--;
            }


            maxCount = Math.max(maxCount, i-start+1);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] testArr = new int[] {1,0,1,1,0};
        System.out.println(findMaxConsecutiveOnes(testArr));
    }
}
