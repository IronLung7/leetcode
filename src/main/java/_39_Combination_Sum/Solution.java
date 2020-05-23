package _39_Combination_Sum;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> step = new ArrayList<Integer>();
        step (candidates,step,  target, 0,ret);
        return ret;

    }

    public void step(int[] candidates,List<Integer> step,int target,int k , List<List<Integer>> ret){
        if (target == 0) {
            ret.add(new ArrayList<Integer>(step));
            return;
        }
        for (int i =k; i < candidates.length; i++) {
            Integer value = candidates[i];
            if (value <= target){
                step.add(value);
                step(candidates,step , target -value,i,ret);
                step.remove(value);
            }
        }

    }
}