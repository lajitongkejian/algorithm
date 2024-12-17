/**
 * 项目名称：algorithm
 * 类名称：Solution509
 * 作者：tkj
 * 日期：2024/12/11
 * 描述：
 */
public class Solution509 {
    public int fib(int n) {
        if(n == 0 || n == 1) return n;
        int dp0 = 0;
        int dp1 = 1;
        int dp2 = 0;
        for(int i = 2 ;i <= n;i++){
            dp2 = dp0 + dp1;
            dp0 = dp1;
            dp1 = dp2;
        }
        return dp2;
    }
}
