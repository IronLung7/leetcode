package _300Longest_Increasing_Subsequence;

import java.util.Arrays;

/**
 * Created by apple on 2017/3/21.
 * 最长递增子序列长度
 * 法1：
 * len[i]记录 到nums[i]的最大长度
 * 法2：
 * 用res[]记录，对于nums[i]，如果比res[]中末尾（即最大数字）大的话，添加到res的末尾（子序列长度+1），
 * 否则从头遍历res，找到第一个比nums[i]小的res[j]，替换掉res[j]。
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = 1;
        int[] len = new int[nums.length];
        Arrays.fill(len, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    len[i] = Math.max(len[j] + 1, len[i]);
            }
            max = Math.max(max, len[i]);
        }
        return max;
    }

    public int lengthOfLIS2(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }

        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            int j;
            for(j=0;j<res.length;j++){
                if(res[j]>nums[i])
                    break;
            }
            res[j] = nums[i];
        }
        return res.length;
    }

}
