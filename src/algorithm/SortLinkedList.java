package algorithm;

/**
 * Created by Administrator on 2017/4/21/021.
 */
public class SortLinkedList {
    public ListNode sortLinkedList(ListNode head){
        quickSort(head,null);
        return head;
    }

    public static void quickSort(ListNode head,ListNode end){
        if (head != end){
            ListNode pation =  pation(head,end);
            quickSort(head,pation);
            quickSort(pation.next,end);
        }
    }

    public static ListNode pation(ListNode head,ListNode end){
        int x = head.val;
        ListNode i = head;
        ListNode j = i.next;
        while (j != end){
            if(j.val < x){
                i = i.next;
                int temp = i.val;
                i.val = j.val;
                j.val = temp;
            }
            j = j.next;
        }

        int temp = i.val;
        i.val = head.val;
        head.val = temp;
        return i;
    }


}
