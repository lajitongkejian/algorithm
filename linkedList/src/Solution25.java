public class Solution25 {
    static ListNode prev = null;
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        int length = getLength(head);
        if(length<k) return head;
        int cnt = length/k;
        ListNode cur = head;
        ListNode temp = head;

        ListNode rear = head.next;
        ListNode ans = head;
        for(int j = 0;j<k-1;j++){
            ans = ans.next;
        }
        for(int i = 0;i<cnt;i++){
            cur = reverse(cur,k);
        }
        return ans;
    }
    public static int getLength(ListNode head){
        //
        int cnt = 0;
        while(head!=null){
            head = head.next;
            cnt++;
        }
        return cnt;
    }
    public static ListNode reverse(ListNode head,int k){
        ListNode cur = head;
        ListNode rear = head.next;
        ListNode temp = null;
        for(int i = 0;i<k-1;i++){
            temp = rear.next;
            rear.next = cur;
            cur = rear;
            rear = temp;
        }
        head.next = temp;
        if(prev!=null) prev.next = cur;
        prev = head;
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.buildListNode(1,2,3,4,5);
        head = reverseKGroup(head,2);
        head.print();
    }
}
