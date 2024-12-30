/**
 * 项目名称：algorithm
 * 类名称：Solution718
 * 作者：tkj
 * 日期：2024/12/30
 * 描述：
 */
public class Solution718 {
    public int findLength(int[] nums1, int[] nums2) {
        int[] dp = new int[nums1.length+1];
        int max = 0;
        for(int i = 1;i<=nums2.length;i++){
            for(int j = nums1.length;j>0;j--){
                if(nums2[i-1] == nums1[j-1]){
                    dp[j] = dp[j-1]+1;
                    max = Math.max(dp[j],max);
                }else dp[j] = 0;
            }
        }
        return max;
    }

}
