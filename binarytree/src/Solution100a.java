

/**
 * 项目名称：algorithm
 * 类名称：Solution100
 * 作者：tkj
 * 日期：2024/11/1
 */
public class Solution100a {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null) return q==null;
        if(q==null) return p==null;
        if(p.val!=q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
