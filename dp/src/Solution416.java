import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution6
 * 作者：tkj
 * 日期：2024/12/23
 * 描述：
 */
public class Solution416 {
    public static boolean canPartition(int[] nums) {
        int size = nums.length;
        int sum = Arrays.stream(nums).sum();
        if(sum % 2 != 0) return false;
        sum = sum/2;
        int[] dp = new int[sum+1];
        for(int i = 0;i < size;i++){
            for(int j = dp.length-1;j >= nums[i];j--){
                dp[j] = Math.max(dp[j],dp[j-nums[i]] + nums[i]);
            }
            if(dp[sum] == sum) return true;
        }
        return dp[sum] == sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5};
        System.out.println(canPartition(nums));
    }
}
