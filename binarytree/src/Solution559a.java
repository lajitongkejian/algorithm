/**
 * 项目名称：algorithm
 * 类名称：Solution559
 * 作者：tkj
 * 日期：2024/11/5
 */
public class Solution559a {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int max = 1;
        for(Node child : root.children){
            max = Math.max(maxDepth(child)+1, max);
        }
        return max;
    }
}
