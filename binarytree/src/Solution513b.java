import java.util.LinkedList;
import java.util.Queue;

/**
 * 项目名称：algorithm
 * 类名称：Solution513a
 * 作者：tkj
 * 日期：2024/11/5
 */
public class Solution513b {
    public int findBottomLeftValue(TreeNode root) {
        TreeNode left = root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(i==0) left = node;
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }
        return left.val;
    }
}
