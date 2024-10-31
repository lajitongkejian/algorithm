public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        ListNode prev = null;
        int cnt = n;
        while(cur1!=null){
            if(cnt>0){
                cnt--;
                cur1 = cur1.next;
            }else{
                prev = cur2;
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        if(prev!=null) prev.next = cur2.next;
        else return head.next;
        return head;
    }
}
