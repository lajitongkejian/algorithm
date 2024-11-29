import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 项目名称：algorithm
 * 类名称：Solution637a
 * 作者：tkj
 * 日期：2024/11/29
 * 描述：
 */
public class Solution637b {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for(int i = 0;i<size;i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if(null != node.left) queue.offer(node.left);
                if(null != node.right) queue.offer(node.right);
            }
            result.add(sum/size);
        }
        return result;
    }

}
