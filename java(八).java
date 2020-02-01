方法一：

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
          if(head == null){
           return null;
       }
       ListNode cur = head.next;
       ListNode newHead = new ListNode(head.val);
       ListNode prev = newHead;
       for(;cur != null; cur = cur.next){
           if(cur.val == val){
               if(cur.next == null){
                   prev.next = null;
                }
               continue;
           }
           prev.next = cur;
           prev = prev.next;
       }
       if(newHead.val == val && newHead.next != null){
           return newHead.next;
       }else if(newHead.val == val && newHead.next == null){
           return null;
       }
       return newHead;
    }
}


方法二：
public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode cur = head.next;
        ListNode prev = head;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

方法三：
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode cur = newHead;
        while(cur.next != null){
            if(val == cur.next.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return newHead.next;
    }
}
