import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：algorithm
 * 类名称：Solution106
 * 作者：tkj
 * 日期：2024/11/18
 * 描述：
 */
public class Solution106 {
    private Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0) return null;
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    public TreeNode build(int[] inorder, int[] postorder,int inStart,int inEnd,int postStart,int postEnd) {
        if(inStart > inEnd || postStart > postEnd) return null;
        int val = postorder[postEnd];
        TreeNode root = new TreeNode(val);
        int index = map.get(val);
        root.left = build(inorder,postorder,inStart,index-1,postStart,postStart+index-inStart-1);
        root.right = build(inorder,postorder,index+1,inEnd,postStart+index-inStart,postEnd-1);
        return root;
    }
}
