import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 项目名称：algorithm
 * 类名称：Solution429b
 * 作者：tkj
 * 日期：2024/11/29
 * 描述：
 */
public class Solution429b {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i = 0;i<size;i++){
                Node node = queue.poll();
                list.add(node.val);
                for(Node child: node.children) {
                    if(child!=null) queue.offer(child);
                }
            }
            res.add(list);
        }
        return res;
    }
}
