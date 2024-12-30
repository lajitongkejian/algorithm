/**
 * 项目名称：algorithm
 * 类名称：Solution674
 * 作者：tkj
 * 日期：2024/12/30
 * 描述：
 */
public class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int prev = 1;
        int cur = 1;
        int max = 1;
        for(int i = 1;i < nums.length;i++){
            cur = 1;
            if(nums[i] > nums[i-1]) cur = prev + 1;
            max = Math.max(cur,max);
            prev = cur;
        }
        return max;
    }
}
