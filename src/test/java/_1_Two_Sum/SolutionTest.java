package _1_Two_Sum;

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

        int [] input = {2, 7, 11, 15};

        System.out.println(Arrays.toString(mSolution.twoSum(input, 7)));
    }
}
