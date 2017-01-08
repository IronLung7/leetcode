package _34_Search_for_a_Range;

/**
 * Created by zhu on 2017/1/8.
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) {
            return new int[]{-1,-1};
        }

        int start = 0;
        int end = length - 1;
        int found = -1;

        while (true) {
            if (start >end){
                break;
            }
            int pivot = (start+end)/2;

            if (nums[pivot]>target){
                if (pivot ==0 ){
                    break;
                }
                end = pivot-1;
                continue;
            }

            if (nums[pivot]<target){
                if (pivot == length-1 ){
                    break;
                }
                start = pivot+1;
                continue;
            }


            if ( nums[pivot] == target) {
                found = pivot;
                break;
            }
        }

        if (found == -1){
            return new int[]{-1,-1};
        }

        int foundLeft = findLeft(nums,start,(start+end)/2-1,target);
        int foundRight = findRight(nums,(start+end)/2+1,end,target);
        int left = found;
        int right =found;
        if(foundLeft != -1) {
            left = foundLeft;
        }
        if (foundRight != -1 ){
            right = foundRight;
        }
        System.out.println(left+"   "+right);
        return new int[]{left,right};
    }

    public int findLeft(int[] nums, int start,int end, int target){
        int endBound= end;
        int startBound = start;
        int found  = -1;
        while (true) {
            if (start >end){
                break;
            }
            int pivot = (start +end )/2;
            if (nums[pivot]>target){
                if (pivot ==startBound ){
                    break;
                }
                end = pivot-1;
                continue;

            }

            if (nums[pivot]<target){
                if (pivot == endBound ){
                    break;
                }
                start = pivot+1;
                continue;

            }


            if ( nums[pivot] == target) {
                found = pivot;
                if (pivot ==startBound ){
                    break;
                }
                end = pivot-1;
                continue;

            }
        }
        return found;
    }

    public  int findRight(int[] nums, int start,int end, int target){
        int endBound= end;
        int startBound = start;
        int found  = -1;
        while (true) {
            if (start >end){
                break;
            }
            int pivot = (start +end )/2;
            if (nums[pivot]>target){
                if (pivot ==startBound ){
                    break;
                }
                end = pivot-1;
                continue;

            }

            if (nums[pivot]<target){
                if (pivot == endBound ){
                    break;
                }
                start = pivot+1;
                continue;

            }


            if ( nums[pivot] == target) {
                found = pivot;
                if (pivot == endBound ){
                    break;
                }
                start = pivot+1;
                continue;

            }
        }
        return found;
    }

}