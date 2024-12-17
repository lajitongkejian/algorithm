import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution1382
 * 作者：tkj
 * 日期：2024/12/4
 * 描述：
 */
public class Solution1382 {
    List<Integer> list = new ArrayList<Integer>();
    public TreeNode balanceBST(TreeNode root) {
        traverse(root);
        return construct(0,list.size()-1);
    }
    public void traverse(TreeNode root) {
        if(root == null) return;
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
    public TreeNode construct(int start,int end){
        if(start > end) return null;
        int index = (start+end)/2;
        TreeNode node = new TreeNode(list.get(index));
        node.left = construct(start,index-1);
        node.right = construct(index+1,end);
        return node;
    }
}
