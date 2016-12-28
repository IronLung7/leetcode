package _2_Add_Two_Numbers;

/**
 * Created by zhu on 2016/12/26.
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        ListNode previous = result;

        ListNode index1 = l1;
        ListNode index2 = l2;

        int carry = 0;

        while (index1 != null && index2 != null) {
            int sum = index1.val + index2.val + carry;
            carry = sum / 10;
            current.val = sum % 10;
            current.next = new ListNode(0);
            previous = current;
            current = current.next;
            index1 = index1.next;
            index2 = index2.next;
        }


        ListNode longer = null;
        if (index1 != null) {
            longer = index1;
        }
        if (index2 != null) {
            longer = index2;
        }

        while (longer != null) {
            int sum = longer.val + carry;
            carry = sum / 10;
            current.val = sum % 10;
            current.next = new ListNode(0);
            previous = current;
            current = current.next;
            longer = longer.next;
        }

        if (carry != 0) {
            current.val = carry;
        } else {
            if (current != null && current.val == 0 ){
                previous.next = null;
            }
        }

        return result;
    }
}