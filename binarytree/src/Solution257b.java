import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 项目名称：algorithm
 * 类名称：Solution257
 * 作者：tkj
 * 日期：2024/11/5
 */
public class Solution257b {
    public List<String> list =  new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<StringBuilder> path = new LinkedList<>();
        StringBuilder builder = new StringBuilder();
        builder.append(root.val);
        path.offer(builder);
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                StringBuilder temp = path.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                    StringBuilder temp2 = new StringBuilder(temp);
                    temp2.append("->");
                    temp2.append(node.left.val);
                    path.offer(temp2);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                    StringBuilder temp3 = new StringBuilder(temp);
                    temp3.append("->");
                    temp3.append(node.right.val);
                    path.offer(temp3);
                }
                if(node.right == null && node.left == null){
                    list.add(temp.toString());
                }
            }
        }
        return list;
    }
}
