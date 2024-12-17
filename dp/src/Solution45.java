/**
 * 项目名称：algorithm
 * 类名称：Solution45
 * 作者：tkj
 * 日期：2024/12/11
 * 描述：
 */
public class Solution45 {

    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;
        int j = 0;
        for(int i = 1; i<nums.length; i++){
            while(j + nums[j] < i){
                j ++;
            }
            //j就是距离i能够一步到达最远的位置
            dp[i] = dp[j] + 1;
        }
        return dp[nums.length-1];
    }
}
