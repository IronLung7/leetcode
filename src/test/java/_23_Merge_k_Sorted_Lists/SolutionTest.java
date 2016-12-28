package _23_Merge_k_Sorted_Lists;


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
    public void mergeKLists() throws Exception {
        System.out.println(mSolution.mergeKLists(new ListNode[]{null}));
    }
}
