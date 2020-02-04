/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        int len = size(head);
        if(head == null || k <= 0 || k > len ){
            return null;
        }
        ListNode fast = head;
        ListNode cur  = head;
        for(int i = 0; i < k ; ++i){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            cur = cur.next;
        }
        return cur;
    }
    public int size(ListNode head){
        int size = 0;
        ListNode cur = head;
        while(cur != null){
            cur = cur.next;
            size++;
        }
        return size;
    }
}