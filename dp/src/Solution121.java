/**
 * 项目名称：algorithm
 * 类名称：Solution121
 * 作者：tkj
 * 日期：2024/12/26
 * 描述：
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        int[] curDP = new int[2];
        int[] prevDP = new int[2];
        prevDP[0] = -prices[0];
        for(int i = 1;i<prices.length;i++){
            curDP[0] = Math.max(prevDP[0],-prices[i]);
            curDP[1] = Math.max(prevDP[1],prevDP[0]+prices[i]);
            prevDP[0] = curDP[0];
            prevDP[1] = curDP[1];
        }
        return curDP[1];
    }
}
