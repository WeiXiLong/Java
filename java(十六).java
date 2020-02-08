import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        if(A == null || A.next == null){
            return true;
        }
        int len = size(A);
        ListNode cur = A;
        for(int i = 0; i < len / 2;++i,cur = cur.next);
        ListNode B = cur;
        
        ListNode prev = null;
        while(B != null){
            ListNode next = B.next;
            B.next = prev;
            if(next == null){
               break;
            }
            prev = B;
            B = next;
        }
        
        while(B != null){
            if(B.val != A.val){
                return false;
            }
            B = B.next;
            A = A.next;
        }
        return true;
    }
    
    int size(ListNode A){
        int size = 0;
        for(;A != null; A = A.next,++size);
        return size;
    }
}