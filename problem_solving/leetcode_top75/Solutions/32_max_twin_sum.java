class Solution {
    public int pairSum(ListNode head) {
        int max=0;
        ListNode slow=head,fast=head;
        for(;fast!=null && fast.next!=null;){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid=slow, prev=null, tmp;
        for(;mid!=null;){
            tmp = mid.next;
            mid.next = prev;
            prev = mid;
            mid = tmp;
        }
        ListNode current = head;
        for(;prev!=null;){
            max = Math.max(max, current.val + prev.val);
            current = current.next;
            prev = prev.next;
        }
        return max;
    }
}