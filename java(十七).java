/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int lenA = size(headA);
        int lenB = size(headB);
        if(lenA > lenB){
            int setoff = lenA - lenB;
            for(int i = 0; i < setoff; ++i,headA = headA.next);
        }else if (lenB > lenA) {
            int setoff = lenB - lenA;
            for(int i = 0; i < setoff; ++i,headB = headB.next);
        }
        
        while(headA != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null; 
    }
    
    int size(ListNode head){
        int size = 0;
        for( ; head != null; head = head.next,size++);
        return size;
    }
}