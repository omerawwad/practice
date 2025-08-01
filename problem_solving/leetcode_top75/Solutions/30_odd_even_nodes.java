class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode current=head,even,eventmp;

        if(head==null) return head;
        if(current.next == null) return head;
        else even = current.next;
        if(even.next == null) return head;
        else {
            current = even.next;
            head.next = current;
        }

        eventmp = even;
        for(;current.next!=null;){
            eventmp.next = current.next;
            eventmp = eventmp.next;
            if(eventmp.next!=null){
                current.next = eventmp.next;
                current = eventmp.next;
            }
            else break;
        }
        eventmp.next = null;
        current.next = even;
        return head;
        
    }
}