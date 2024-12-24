/**
 * 项目名称：algorithm
 * 类名称：Solution62
 * 作者：tkj
 * 日期：2024/12/13
 * 描述：
 */
public class Solution62 {
    public int uniquePaths(int m, int n) {
        int bottom = Math.max(m, n) - 1;
        int top = Math.min(m, n) - 1;
        return c(bottom,top);
    }
    public int c(int bottom, int top) {
        int res = 1;
        for(int i = 0; i < top; i++) {
            res *= (bottom-top);
        }
        for(int i = 1; i <= top; i++) {
            res /= i;
        }
        return res;
    }
}
