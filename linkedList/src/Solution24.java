public class Solution24 {
   public static ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode cur = head;
        ListNode rear = cur.next;
        ListNode ans = rear;
        ListNode prev = null;
        while(cur!=null&&cur.next!=null){
            rear = cur.next;
            cur.next = rear.next;
            rear.next = cur;
            if(prev!=null) prev.next = rear;
            prev = cur;
            cur = cur.next;

        }
        return ans;
    }
    public static void main(String[] args) {
        ListNode head = ListNode.buildListNode(1,2,3,4,5);
        head.print();
    }
}
