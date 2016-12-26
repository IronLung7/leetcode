package _1_Two_Sum;

import java.util.HashMap;

/**
 * Created by zhu on 2016/12/25.
 */

public class Solution {

    public HashMap<Integer, Integer> map;

    public int[] twoSum(int[] nums, int target) {

        map = new HashMap<Integer, Integer>();

        int index = 0;
        for ( ;index <nums.length ; index ++){
            if (map.containsKey(nums[index])) {
                break;
            }
            int absoluteDifference = target - nums[index];
            map.put(absoluteDifference, index);
        }

        return new int[] {map.get(nums[index]), index};
    }
}