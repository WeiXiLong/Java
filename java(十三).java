方式一:
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return preHead.next;
    }
}

方式二：这种方法与上一种方法的区别其实不大
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode Head = new ListNode(-1);
        ListNode prev = Head;
        while(l1 != null && l2 != null){
            ListNode cur = new ListNode(0);
            if(l1.val <= l2.val){
                cur.val = l1.val;
                l1 = l1.next;
            }else{
                cur.val = l2.val;
                l2 = l2.next;
            }
            prev.next = cur;
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return Head.next;
    }
}

方式三：
