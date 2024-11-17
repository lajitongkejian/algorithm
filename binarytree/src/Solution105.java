import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：algorithm
 * 类名称：Solution105
 * 作者：tkj
 * 日期：2024/11/16
 * 描述：
 */
public class Solution105 {
    static Map<Integer,Integer> in = new HashMap<>();
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) return null;
        for (int i = 0; i < preorder.length; i++) {
            in.put(inorder[i],i);
        }
        return build(preorder,inorder,0,preorder.length - 1,0, preorder.length -1 );
    }

    public static TreeNode build(int[] preorder, int[] inorder,int preLeft,int preRight,int inLeft,int inRight) {
        if(preLeft > preRight || inLeft > inRight) return null;
        TreeNode root = new TreeNode(preorder[preLeft]);
        int inIndex = in.get(root.val);
        int leftLength = inIndex - inLeft;
        root.left = build(preorder,inorder,preLeft+1,preLeft+leftLength,inLeft,inIndex-1);
        root.right = build(preorder,inorder,preLeft+leftLength+1 ,preRight,inIndex+1,inRight);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = buildTree(preorder,inorder);
    }
}
