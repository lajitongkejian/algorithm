/**
 * 项目名称：algorithm
 * 类名称：Solution142
 * 作者：tkj
 * 日期：2024/10/25
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        //f = 2s,f-s == c,
        ListNode slow = head;
        ListNode fast = head;
        ListNode cur = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                while(cur!=slow){
                    cur = cur.next;
                    slow = slow.next;
                }
                return cur;
            }
        }
        return null;
    }
}
