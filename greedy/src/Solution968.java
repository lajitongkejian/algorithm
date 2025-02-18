

/**
 * 项目名称：algorithm
 * 类名称：Solution968
 * 作者：tkj
 * 日期：2025/2/18
 * 描述：
 */
public class Solution968 {
    int ans = 0;
    public int minCameraCover(TreeNode root) {
        if(root.left==null && root.right==null) return 1;
        boolean[] res = traverse(root);
        if(!res[1])ans++;
        return ans;
    }
    public boolean[] traverse(TreeNode root){
        if(root == null) return new boolean[]{false,true};
        boolean[] left = traverse(root.left);
        boolean[] right = traverse(root.right);
        boolean[] res = new boolean[2];
        if(!left[1] || !right[1]){
            ans++;
            res[1] = true;
            res[0] = true;
        }else{
            if(left[0] || right[0]){
                res[1] = true;
            }
            res[0] = false;
        }
        return res;
    }
}
