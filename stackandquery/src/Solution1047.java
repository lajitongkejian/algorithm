import java.util.LinkedList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution1047
 * 作者：tkj
 * 日期：2024/10/31
 */
public class Solution1047 {
    public String removeDuplicates(String s) {
        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();
    }
}
