package _2Add_Two_Numbers;

/**
 * Created by apple on 2017/7/4.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carrybit = false;
        int num = l1.val + l2.val;
        if (num >= 10)
            carrybit = true;
        ListNode result = new ListNode(num % 10);
        ListNode node = result;
        while (l1.next != null || l2.next != null) {
            num = 0;
            if (l1.next != null) {
                l1 = l1.next;
                num += l1.val;
            }

            if (l2.next != null) {
                l2 = l2.next;
                num += l2.val;
            }

            if (carrybit) {
                num += 1;
                carrybit = false;
            }
            if (num >= 10)
                carrybit = true;
            node.next = new ListNode(num % 10);
            node = node.next;
        }

        if (carrybit) {
            node.next = new ListNode(1);
        }

        return result;
    }

}
