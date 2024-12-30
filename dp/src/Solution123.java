/**
 * 项目名称：algorithm
 * 类名称：Solution123
 * 作者：tkj
 * 日期：2024/12/27
 * 描述：
 */
public class Solution123 {
    public int maxProfit(int[] prices) {
        int[] prev = new int[5];
        prev[0] = 0;
        prev[1] = -prices[0];
        prev[2] = 0;
        prev[3] = -prices[0];
        prev[4] = 0;
        for(int i = 1;i < prices.length;i++){
            prev[1] = Math.max(prev[0] - prices[i],prev[1]);
            prev[2] = Math.max(prev[1] + prices[i],prev[2]);
            prev[3] = Math.max(prev[2] - prices[i],prev[3]);
            prev[4] = Math.max(prev[3] + prices[i],prev[4]);

        }
        return prev[4];
    }
}
