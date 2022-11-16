class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;

    while(left > 1){
        prev = curr;
        curr = curr.next;
        left--;right--;
    }
    ListNode dhead = prev;
    ListNode tail = curr;
    ListNode third = null;
    while(right-->0){
         third = curr.next;
        curr.next = prev;
        prev = curr;
        curr = third;
    }
    tail.next = curr;
    if(dhead!=null)
    dhead.next = prev;
    else head = prev;
    return head;
    }
}
