/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode newHead = new ListNode(-1);
        ListNode prev = newHead;
        
        while(pHead != null){
            if(pHead.next != null && pHead.val == pHead.next.val){
                while(pHead.next != null && pHead.val == pHead.next.val){
                    pHead = pHead.next;
                }
                pHead = pHead.next;
            }else {
                prev.next = new ListNode(pHead.val);
                prev = prev.next;
                pHead = pHead.next;
            }
        }
        return newHead.next;
    }
}