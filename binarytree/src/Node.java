import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Node
 * 作者：tkj
 * 日期：2024/11/5
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
