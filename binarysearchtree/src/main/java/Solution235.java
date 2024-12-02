/**
 * 项目名称：algorithm
 * 类名称：Solution235
 * 作者：tkj
 * 日期：2024/12/2
 * 描述：
 */
public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root.val > p.val && root.val > q.val ){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
