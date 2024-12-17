/**
 * 项目名称：algorithm
 * 类名称：Solution70
 * 作者：tkj
 * 日期：2024/12/17
 * 描述：
 */
public class Solution70 {
    public int climbStairs(int n) {
        int dp1 = 1;
        int dp2 = 2;
        if(n<=2) return n;
        for(int i = 3; i <= n; i++) {
            int cur = dp1 + dp2 ;
            dp1 = dp2;
            dp2 = cur;

        }
        return dp2;
    }
}
