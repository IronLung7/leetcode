package _84_Largest_Rectangle_in_Histogram;


public class Solution2 {

    public static void main(String[] args){
        Solution2 solution2 = new Solution2();
        int[] test = {2,1,2};
        System.out.println(solution2.largestRectangleArea(test));
    }
    public int largestRectangleArea(int[] heights) {
        int maxSize = 0;

        int left_position[] = new int[heights.length];
        int right_position[] = new int[heights.length];

        for (int index = 0 ; index < heights.length;index ++){
            int left = index;
            int right =index;
            int height = heights[index];

            if (index>0 && heights[index-1] == height){
                left_position[index] = left_position[index-1];
            } else {
                while(left - 1 >= 0 && heights[left-1] >= height ) {
                    left --;
                }
                left_position[index] = left;

            }

            while (right + 1 < heights.length && heights[right+1] >= height) {
                right ++;
            }
            right_position[index] = right;
//            int size = (right -left +1) * height;
//            if (size > maxSize){
//                maxSize = size;
//            }
        }

        for (int index = 0 ; index < heights.length;index ++) {
            maxSize = Math.max(maxSize, (right_position[index] - left_position[index] +1)* heights[index]);
        }

        return maxSize;
    }

}