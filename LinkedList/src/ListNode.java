public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }
    public static ListNode buildListNode(int... nums){
        ListNode head = new ListNode();
        ListNode prev = head;
        for (int num : nums) {
            ListNode node = new ListNode(num);
            prev.next = node;
            prev = node;
        }
        ListNode ans = head.next;
        head = null;
        return ans;
    }
    public void print(){
        ListNode node = this;
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
