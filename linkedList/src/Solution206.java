/**
 * 项目名称：algorithm
 * 类名称：Solution206
 * 作者：tkj
 * 日期：2024/10/26
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode cur = head;
        ListNode prev = null;
        ListNode rear;
        while(cur!=null){
            rear = cur.next;
            cur.next = prev;
            prev = cur;
            cur = rear;
        }
        return prev;
    }
}
