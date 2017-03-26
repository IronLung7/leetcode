package _26_Remove_Duplicates_from_Sorted_Array;

/**
 * Created by zhu on 2017/3/26.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length != 0) {
            int size = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[size] != nums[i]) {
                    size++;
                    nums[size] = nums[i];
                }
            }
            return size + 1;
        } else {
            return 0;
        }
    }
}
