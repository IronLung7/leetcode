package _35_Search_Insert_Position;

public class Solution {
    public static void main(String [] args) {
        Solution solution = new Solution();
        int[] test = new int[]{1,3,5,7};
        System.out.println(solution.searchInsert(test, 6));
    }
    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0])
            return 0;
        if (target > nums[nums.length-1])
            return nums.length;
        int high = nums.length -1;
        int low = 0;

        while (true) {
            int index = (high - low) /2 + low;
            if (nums[index] == target) {
                return index;
            }

            if (nums[index] < target) {
                if (nums[index + 1] == target) {
                    return index + 1;
                } else if (nums[index + 1] > target) {
                    return index +1;
                } else{
                    low = index + 1;
                    continue;
                }
            }

            if (nums[index] > target) {
                if (nums[index -1] == target) {
                    return index - 1;
                }
                else if (nums[index -1] < target) {
                    return index;
                } else {
                    high = index -1;
                    continue;
                }
            }
        }
    }
}
