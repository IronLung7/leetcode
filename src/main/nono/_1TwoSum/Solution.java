package _1TwoSum;

import java.util.HashMap;

/**
 * Created by apple on 2017/7/4.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (; index < nums.length; index++) {
            if (map.containsKey(nums[index]))
                break;
            map.put(target - nums[index], index);
        }
        return new int[]{index, map.get(nums[index])};
    }
}
