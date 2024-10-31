/**
 * 项目名称：algorithm
 * 类名称：Solution160
 * 作者：tkj
 * 日期：2024/10/25
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while(curA!=null && curB!=null){
            curA = curA.next;
            curB = curB.next;
        }
        ListNode temp1 = curA==null ? curB : curA;
        ListNode temp2 = curA==null ? headB : headA;
        ListNode temp3 = curA==null ? headA : headB;
        while(temp1!=null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp2!=null && temp3!=null){
            if(temp2==temp3) return temp2;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        return null;
    }
}
