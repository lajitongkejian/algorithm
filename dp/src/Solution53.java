/**
 * 项目名称：algorithm
 * 类名称：Solution53
 * 作者：tkj
 * 日期：2024/12/13
 * 描述：
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        // int[] dp = new int[nums.length];
        int prev = nums[0];
        // dp[0] = nums[0];
        // int max = dp[0];
        int max = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(prev > 0){
                // dp[i] = nums[i] + dp[i-1];
                prev += nums[i];
            }else{
                prev = nums[i];
            }
            max = Math.max(prev,max);
        }
        return max;
    }
}
