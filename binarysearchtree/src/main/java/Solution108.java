/**
 * 项目名称：algorithm
 * 类名称：Solution108
 * 作者：tkj
 * 日期：2024/12/2
 * 描述：
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        return arrayToTree(nums,0,nums.length-1);
    }
    public TreeNode arrayToTree(int[] nums, int start, int end) {
        if(start > end) return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = arrayToTree(nums,start,mid-1);
        node.right = arrayToTree(nums,mid+1,end);
        return node;
    }
}
