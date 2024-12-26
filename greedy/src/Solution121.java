/**
 * 项目名称：algorithm
 * 类名称：Solution121
 * 作者：tkj
 * 日期：2024/12/26
 * 描述：
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int i = 1;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            max = Math.max(prices[i]-min,max);
        }
        return max;
    }
}
