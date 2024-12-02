/**
 * 项目名称：algorithm
 * 类名称：Solution450
 * 作者：tkj
 * 日期：2024/12/2
 * 描述：
 */
public class Solution450a {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode res = root;
        if(root == null) return null;
        if(root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left == null && root.right == null) {
                return null;
            } else if (root.left == null && root.right != null) {
                return root.right;
            }else if(root.left != null && root.right == null) {
                return root.left;
            }else{
                TreeNode node = root.right;
                while(node.left != null) {
                    node = node.left;
                }
                root.val = node.val;
                root.right = deleteNode(root.right,node.val);
            }
        }
        return res;
    }
}
