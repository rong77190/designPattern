package algorithm;

/**
 *
 * 输入一个链表，反转链表后，输出链表的所有元素
 *
 * class ListNode {
 int val;
 ListNode next = null;

 ListNode(int val) {
 this.val = val;
 }
 }
 */
public class ReverseList {
    //断开
    public ListNode reverseList(ListNode head){

        ListNode pre = null;
        ListNode next = null;

        if (head == null){
            return null;
        }

        while (head != null){
            next = head.next;
            head.next = pre;

            pre = head;
            head = next;
        }
        return pre;
    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null ){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
//        if (list1.val <= list2.val){
//            list1.next = Merge(list1.next,list2);
//            return list1;
//        }else {
//            list2.next = Merge(list1,list2.next);
//            return list2;
//        }

        ListNode mergeHead = null;
        ListNode current = null;
    while (list1 != null && list2 != null){
        if (list1.val <= list2.val){
            if (mergeHead == null){
                mergeHead = current = list1;
            }else {
                current.next = list1;
                current = current.next;
            }
        }else {
            if (mergeHead == null){
                mergeHead = current = list2;
            }else {
                current.next = list2;
                current = current.next;
            }
        }

    }
        return mergeHead;
    }
}