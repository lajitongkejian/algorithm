import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution257a
 * 作者：tkj
 * 日期：2024/11/5
 */
public class Solution257a {
    public List<String> ans = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return ans;
        preOrderTraversal(root,new StringBuilder());
        return ans;
    }
    public void preOrderTraversal(TreeNode root,StringBuilder pre) {
        if(root.left == null && root.right == null) {
            if(pre.length()==0){
                ans.add(Integer.toString(root.val));
                return;
            }else {
                ans.add(pre.append("->").append(root.val).toString());
                return;
            }
        }
        if(root.left!=null) {
            if(pre.length()==0) preOrderTraversal(root.left,new StringBuilder().append(root.val));
            else preOrderTraversal(root.left,new StringBuilder(pre).append("->").append(root.val));
        }
        if(root.right!=null) {
            if(pre.length()==0) preOrderTraversal(root.right,new StringBuilder().append(root.val));
            else preOrderTraversal(root.right,new StringBuilder(pre).append("->").append(root.val));
        }
    }
}
