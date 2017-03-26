package _26_Remove_Duplicates_from_Sorted_Array;

import java.util.Arrays;

/**
 * Created by zhu on 2016/12/25.
 */
public class SolutionTest {

    private Solution mSolution;


    @org.junit.Before
    public void setUp() throws Exception {
        mSolution = new Solution();
    }

    @org.junit.Test
    public void testTwoSum() throws Exception {

        int [] input = {1 ,1,3,3,6,6,6, 7, 11, 15};

        System.out.println(mSolution.removeDuplicates(input)+" "+ Arrays.toString(input));

    }
}
