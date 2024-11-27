package org.example;
import java.util.*;
public class minswaps {
    private int[][] memo;
    public int minSwap(int[] nums1, int[] nums2) {
        this.memo = new int[nums1.length][2];
        for (int[] row : memo) Arrays.fill(row, -1);
        return dp(nums1, nums2, 0, 0);
    }

    private int dp(int[] nums1, int[] nums2, int i, int prevSwapped) {
        if (i >= nums1.length) {
            return 0;
        }

        if (memo[i][prevSwapped] != -1) {
            return memo[i][prevSwapped];
        }

        int prevNums1 = Integer.MIN_VALUE;
        int prevNums2 = Integer.MIN_VALUE;
        if (i > 0 && prevSwapped == 0) {
            prevNums1 = nums1[i-1];
            prevNums2 = nums2[i-1];
        } else if (i > 0) {
            prevNums2 = nums1[i-1];
            prevNums1 = nums2[i-1];
        }

        int min = Integer.MAX_VALUE;
        // We can keep this the same
        if (prevNums1 < nums1[i] && prevNums2 < nums2[i]) {
            min = Math.min(min, dp(nums1, nums2, i + 1, 0));
        }

        // see if we can swap
        if (prevNums1 < nums2[i] && prevNums2 < nums1[i]) {
            min = Math.min(min, dp(nums1, nums2, i + 1, 1) + 1);
        }

        return memo[i][prevSwapped] = min;
    }
}
