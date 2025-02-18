/**
 * 项目名称：algorithm
 * 类名称：Solution122
 * 作者：tkj
 * 日期：2024/12/26
 * 描述：
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        int res = 0;
        int cur = prices[0];
        for(int i = 1;i<prices.length;i++){
            if(cur < prices[i]) res += prices[i]-cur;
            cur = prices[i];
        }
        return res;
    }
}
