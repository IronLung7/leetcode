package _15_3Sum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhu on 2017/3/26.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new LinkedList<>();

        if (nums.length < 3) {
            return ret;
        }

        Arrays.sort(nums);
        Integer previousFirst = null;
        for (int i = 0; i < nums.length-2 && nums[i] <= 0; i++) {
            if (previousFirst != null && previousFirst == nums[i]) {
                continue;
            }
            int secondIndex = i + 1;
            int thirdIndex = nums.length -1;
            int twoSum = 0 - nums[i];

            while (secondIndex < thirdIndex) {
                int sum = nums[secondIndex] +nums[thirdIndex];
                if (twoSum == sum) {
                    ret.add(Arrays.asList(nums[i] , nums[secondIndex], nums[thirdIndex]));
                    System.out.println(Arrays.asList(nums[i] , nums[secondIndex], nums[thirdIndex]).toString());
                    while (secondIndex < thirdIndex && nums[secondIndex] == nums[secondIndex+1]){
                        secondIndex ++;
                    }
                    while (secondIndex < thirdIndex && nums[thirdIndex] == nums[thirdIndex-1]) {
                        thirdIndex --;
                    }
                    secondIndex ++;
                    thirdIndex --;
                } else if (twoSum > sum){
                    secondIndex ++;
                } else {
                    thirdIndex --;
                }
            }

            previousFirst = nums[i];
        }
        return ret;
    }

//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ret = new LinkedList<>();
//
//        if (nums.length < 3) {
//            return ret;
//        }
//
//        Arrays.sort(nums);
//        Integer previousFirst = null, previousSecond = null;
//        for (int i = 0; i < nums.length-2 && nums[i] <= 0; i++) {
//            if (previousFirst != null && previousFirst == nums[i]) {
//                continue;
//            }
//            int first = nums[i];
//            previousSecond = null;
//            for (int j = i + 1; j < nums.length && first + nums[j] <= 0; j++) {
//                if (previousSecond != null && previousSecond == nums[j]) {
//                    continue;
//                }
//                int second = nums[j];
//                for (int k = nums.length - 1; k > j && nums[k] >= 0; k--) {
//                    if (first + second + nums[k] == 0) {
//                        List<Integer> list = new ArrayList<>(3);
//                        list.add(first);
//                        list.add(second);
//                        list.add(nums[k]);
//                        System.out.println(list.toString());
//                        ret.add(list);
//                        break;
//                    }
//                }
//                previousSecond = second;
//            }
//
//            previousFirst = first;
//        }
//        return ret;
//    }

    public static void main(String[] args){
        Solution solution = new Solution();
        solution.threeSum(new int[]{-1,0,1,2,-1,-4});

    }
}
