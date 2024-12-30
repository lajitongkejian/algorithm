/**
 * 项目名称：algorithm
 * 类名称：Solution300
 * 作者：tkj
 * 日期：2024/12/30
 * 描述：
 */
public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 1;
        dp[0] = 1;
        // Arrays.fill(dp,1);
        for(int i = 1;i < nums.length;i++){
            dp[i] = 1;
            for(int j = 0;j < i;j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                max = Math.max(dp[i],max);
            }
        }
        return max;
    }
}
