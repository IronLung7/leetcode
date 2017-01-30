package _25_Reverse_Nodes_in_k_Group;

/**
 * Created by zhu on 2017/1/30.
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        return reversePart(head , k);
    }

    public ListNode reversePart(ListNode head, int k){
        ListNode temp = head;
        int size = 0;
        for (;size <k ; size++){
            if (temp != null) {
                temp = temp.next;
            } else {
                break;
            }
        }
        if (size != k) {
            return head;
        }

        temp = null;
        ListNode newHead = null;
        ListNode first = null;

        first = head;
        for (int i = 0; i < k; i++) {
            temp = head;
            head = head.next;
            temp.next = newHead;
            newHead = temp;
        }

        first.next = reversePart(head, k);
        return newHead;
    }
}
