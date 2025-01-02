/**
 * 项目名称：algorithm
 * 类名称：Solution1035
 * 作者：tkj
 * 日期：2024/12/31
 * 描述：
 */
public class Solution1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        // int[][] dp = new int[nums1.length+1][nums2.length+1];
        int[] dp = new int[nums2.length+1];
        // int max = 0;
        for(int i = 1;i<=nums1.length;i++){
            int prev = dp[0];//相当于dp[i-1][j-1]
            for(int j = 1;j<=nums2.length;j++){
                int cur = dp[j];//相当于dp[i-1][j]
                if(nums1[i-1] == nums2[j-1]){
                    // dp[i][j] = dp[i-1][j-1]+1;
                    dp[j] = prev + 1;
                }else{
                    // dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    dp[j] = Math.max(dp[j-1],cur);
                }
                prev = cur;
                // max = Math.max(dp[j],max);
            }
        }
        return dp[dp.length-1];
    }
}
