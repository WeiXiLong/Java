import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode newHead1 = new ListNode(-1);
        ListNode newHead2 = new ListNode(-1);

        ListNode node1 = newHead1;
        ListNode node2 = newHead2;
        while(pHead != null){
            if(pHead.val < x){
                node1.next = new ListNode(pHead.val);
                node1  = node1.next;
            }else {
                node2.next = new ListNode(pHead.val);
                node2  = node2.next;
            }
            pHead = pHead.next;
        }
        node1.next = newHead2.next;
        return newHead1.next;
    }
}