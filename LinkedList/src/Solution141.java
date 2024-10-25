/**
 * 项目名称：algorithm
 * 类名称：Solution141
 * 作者：tkj
 * 日期：2024/10/25
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
