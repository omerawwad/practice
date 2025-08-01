class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int c=0, m=0;
        ListNode current=head, middle=head;

        for(;current != null;){
            current = current.next;
            c++;
            if(((c/2)-1) > m) {
                middle = middle.next;
                m++;
            }
        }
        if(c<2) head = middle.next;
        else middle.next = middle.next.next;
        return head;
    }
}