import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution1049
 * 作者：tkj
 * 日期：2024/12/24
 * 描述：
 */
public class Solution1049 {
    public int lastStoneWeightII(int[] stones) {
        int s = stones.length;
        int target = Arrays.stream(stones).sum();
        int sum = target/2;
        int[] dp = new int[sum+1];
        for(int i = 0;i < s;i++){
            for(int j = sum;j >=stones[i] ;j--){
                dp[j] = Math.max(dp[j],dp[j-stones[i]] + stones[i]);
            }
        }
        return Math.abs(target-2*dp[sum]);
    }
}
