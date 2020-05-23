package _53_Maximum_Subarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        Integer sum = null;
        int maxSum = nums[0];
        for (int i = 0 ; i < nums.length ; i++ ) {
            if (sum == null) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = null;
            }
        }
        return maxSum;
    }
}
