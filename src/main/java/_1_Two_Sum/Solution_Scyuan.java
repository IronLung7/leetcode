package _1_Two_Sum;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by SongchaoYuan on 2017/1/16.
 */
public class Solution_Scyuan {
    public class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int index = 0;
            for (; index < nums.length; index++) {
                if (map.containsKey(nums[index])) {
                    break;
                }
                map.put(target - nums[index], index);

            }
            return new int[] {map.get(nums[index]), index};
        }
    }
}
