package _55_Jump_Game;

public class Solution {
    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] q = new int[]{9,
                8,
                7,
                6,
                5,
                4,
                3,
                2,
                1,
                1,
                0,
                0};
        System.out.println(solution.canJump(q));
    }

    public boolean canJump(int[] nums) {
        if (check(nums)) {
            return jump(nums, 0);
        }
        return false;
    }

    public boolean check(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i ++){
            if (nums[i] + i >= nums.length -1) {
                return true;
            }
        }
        return false;
    }

    public boolean jump(int[] nums, int position) {
        int step = nums[position];
        System.out.println(position);
        for (int i = 0; i <= step; i ++) {
            if (position + i == nums.length - 1) {
                return true;
            }

            if (position + i < nums.length - 1 && i != 0) {
                if (jump(nums, position + i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
