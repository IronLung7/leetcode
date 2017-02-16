package _456_132_Pattern;

import java.util.Stack;

/**
 * Created by apple on 2017/2/15.
 */
public class Solution {
    public boolean find132pattern(int[] nums) {  //runtime:507ms
        if (nums == null || nums.length < 3) {
            return false;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            int bigger = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] <= nums[i]) continue;
                if (nums[j] >= bigger) {
                    bigger = nums[j];
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find132pattern2(int[] nums) { //runtime:271ms
        if (nums == null || nums.length < 3) {
            return false;
        }

        int n = nums.length, i = 0, j = 0, k = 0;
        while (i < n) {
            //找到前一位比后一位小的i
            while (i < n - 2 && nums[i] >= nums[i + 1]) i++;
            j = i + 1;
            //找到后一位比前一位小的j
            while (j < n - 1 && nums[j] <= nums[j + 1]) j++;
            //找到比num[i]大的k
            k = j + 1;
            while (k < n) {
                if (nums[k] > nums[i] && nums[k] < nums[j])
                    return true;
                k++;
            }
            i = j + 1;
        }

        return false;
    }

    public boolean find132patternbystack(int[] nums) {  //runtime:31ms
        if (nums == null || nums.length < 3) {
            return false;
        }
        int third = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            else while (!stack.empty() && nums[i] > stack.peek()) {
                third = stack.peek();
                stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2};
        Solution solution = new Solution();
        boolean result = solution.find132pattern(nums);
        System.out.println(result);
    }
}
