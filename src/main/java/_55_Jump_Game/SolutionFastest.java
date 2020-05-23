package _55_Jump_Game;

public class SolutionFastest {
    public boolean canJump(int[] nums) {

        for(int index = nums.length - 2; index >= 0; index--) {
            if (nums[index] == 0 && !canPass(nums, index)) {
                return false;
            }
        }

        return true;
    }

    public boolean canPass(int[] nums, int zeroIndex) {
        for (int index = zeroIndex -1 ; index >=0 ; index --) {
            if (index + nums[index] > zeroIndex) {
                return true;
            }
        }
        return false;
    }
}
