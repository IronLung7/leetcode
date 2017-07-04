package _42Trapping_Rain_water;

/**
 * Created by apple on 2017/2/16.
 */
public class Solution {

    public int trap(int[] height) {  //runtime 25ms
        if (height == null || height.length < 3)
            return 0;
        int max = -1, maxIndex = 0;
        int i = 0;
        for (; i < height.length; i++) {  //先找到最高的挡板的位置
            if (height[i] > max) {
                max = height[i];
                maxIndex = i;
            }
        }

        int trap = 0, root = height[0]; //从左边往最高点计算
        for (i = 0; i < maxIndex; i++) {
            if (root < height[i])
                root = height[i];
            else {
                trap = trap + root - height[i];
            }
        }
        root = height[height.length - 1];
        for (i = height.length - 1; i > maxIndex; i--) {
            if (root < height[i])
                root = height[i];
            else
                trap = trap + root - height[i];
        }

        return trap;
    }

    public int trap2(int[] height) {  //runtime 22ms
        if (height == null || height.length < 3) {
            return 0;
        }
        int left = 0, right = height.length - 1;//两边往中间搜索，维护一个次高的挡板作为水的高度
        int level = 0, trap = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                level = Integer.max(level, height[left]);
                trap += level - height[left];
                left++;
            } else {
                level = Integer.max(level, height[right]);
                trap += level - height[right];
                right--;
            }
        }
        return trap;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {5, 3, 7, 7};
        int trap = solution.trap(height);
        System.out.println(trap);
    }
}
