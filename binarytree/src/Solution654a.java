import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution654
 * 作者：tkj
 * 日期：2024/11/11
 * 描述：
 */
public class Solution654a {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums);
    }
    public TreeNode construct(int[] nums) {
        if(null == nums || 0 == nums.length) return null;
        TreeNode root = new TreeNode();
        int maxIndex = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > nums[maxIndex]) maxIndex = i;
        }
        root.val = nums[maxIndex];
        root.left = construct(Arrays.copyOfRange(nums, 0, maxIndex));
        if(maxIndex + 1 < nums.length) root.right = construct(Arrays.copyOfRange(nums, maxIndex+1, nums.length));
        return root;
    }
}
