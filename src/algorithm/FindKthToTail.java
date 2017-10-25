package algorithm;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head,int k){
        if (head == null || k <= 0){
            return null;
        }
        ListNode pre = head;
        ListNode last = head;

        for (int i =0; i < k;i++){
            if (pre.next != null){
                pre = pre.next;
            }else {
                return  null;
            }
        }

        while(pre.next != null){
            pre = pre.next;
            last = last.next;
        }
        return last;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
