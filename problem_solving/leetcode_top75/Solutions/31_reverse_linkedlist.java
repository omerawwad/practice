class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=head, current, tmp;
        if(head==null || head.next==null)return head; 
        current = prev.next;
        prev.next = null;
        for(;current.next!=null;){
            tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }
        current.next = prev;
        return current;
        
    }
}