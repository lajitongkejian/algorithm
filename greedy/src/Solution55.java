/**
 * 项目名称：algorithm
 * 类名称：Solution55
 * 作者：tkj
 * 日期：2025/1/22
 * 描述：
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        if(nums.length<=1) return true;
        int range = 0;
        for(int i = 0;i<=range;i++){
            if(range>=nums.length-1) return true;
            range = Math.max(range,i+nums[i]);
        }
        return false;

    }
}
