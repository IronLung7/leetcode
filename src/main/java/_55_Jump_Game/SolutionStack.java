package _55_Jump_Game;

import java.util.Stack;

public class SolutionStack {
    public static void main(String args[]) {
        SolutionStack solution = new SolutionStack();
        int[] q = new int[]{1};
        System.out.println(solution.canJump(q));
    }

    public boolean canJump(int[] nums) {
        if (!check(nums))
            return false;

        Stack<Integer> steps = new Stack<>();

        steps.push(0);
        while (!steps.empty()) {
            int current = steps.peek();
            if (current + nums[current] >= nums.length - 1) {
                return true;
            }
            if (nums[current] > 0) {
                steps.push(current + nums[current]);
            } else {
                steps.pop();
                if (!steps.empty()) {
                    nums[steps.peek()]--;
                }
            }
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

}
