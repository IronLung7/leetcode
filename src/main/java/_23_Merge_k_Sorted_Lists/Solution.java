package _23_Merge_k_Sorted_Lists;

/**
 * Created by zhu on 2016/12/28.
 */

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0){
            return null;
        }
        int count = 0 ;
        ListNode a = null;
        ListNode b = null;
        for (int i =0; i <lists.length;i ++){
            if (lists[i] !=null) {
                if (a == null) {
                    a= lists[i];
                }else if (b == null) {
                    b = lists[i];
                }
            }
            if (a != null && b != null){
                lists[count] = mergeTwoList(a,b);
                a = null;
                b = null;
                count ++;
            } else if (a != null && i == lists.length -1) {
                lists[count] = a;
                a = null;
                count ++;
            }
        }

        while (count != 1 && count != 0) {
            int creasing = 0;
            for (int i =0; i < count;i ++){
                if (lists[i] !=null) {
                    if (a == null) {
                        a= lists[i];
                    }else if (b == null) {
                        b = lists[i];
                    }
                }
                if (a != null && b != null){
                    lists[creasing] = mergeTwoList(a,b);
                    a = null;
                    b = null;
                    creasing ++;
                }else if (a != null && i == count -1) {
                    lists[creasing] = a;
                    a = null;
                    creasing++;
                }
            }
            count = creasing;
        }
        return lists[0];
    }

    public ListNode mergeTwoList(ListNode a, ListNode b){
        ListNode head = new ListNode(-1);
        ListNode node = head;

        while(a!=null || b!=null){
            ListNode tmp ;

            if (a == null) {
                node.next = b;
                break;
            }
            if (b == null) {
                node.next = a;
                break;
            }

            if (a.val <= b.val){
                tmp = a ;
                a = a.next;
            } else {
                tmp = b ;
                b = b.next;
            }
            node.next = tmp;
            node = node.next;
        }

        return head.next;
    }
}