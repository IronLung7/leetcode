package _25_Reverse_Nodes_in_k_Group;



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
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        ListNode head6 = new ListNode(6);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;


        ListNode node = mSolution.reverseKGroup(head ,2);
        System.out.println(mSolution.reverseKGroup(head ,2));
    }
}
