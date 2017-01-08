package _41_First_Missing_Positive;

import java.util.Arrays;

/**
 * Created by zhu on 2017/1/8.
 */
public class Solution {
    public int firstMissingPositive(int[]  nums) {

        if (nums == null || nums.length ==0){
            return 1;
        }
        for (int i =0 ; i<nums.length ; i ++){
            if (switchNum(nums, i , nums[i])){
                i--;
            }

            System.out.println(Arrays.toString(nums));
        }

        for (int i = 0 ; i<nums.length ; i ++) {
            if (nums[i]!= 1+i){
                return 1+i;
            }
        }
        return nums.length +1;
    }

    public boolean switchNum(int[] nums, int position , int num) {
        if (num <= 0) {
            return false;
        }

        if (num >= nums.length + 1) {
            return false ;
        }

        if (num == nums[num-1]) {
            return false;
        }

        int replacedNum = nums[num-1];
        nums[num-1] = num;
        nums[position] = replacedNum;
        return true;

    }
}
