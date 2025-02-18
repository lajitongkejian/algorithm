import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution1005
 * 作者：tkj
 * 日期：2025/1/23
 * 描述：
 */
public class Solution1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int min = 0;
        for(int i = 0;i<k;i++){
            min = getMin(nums);
            nums[min] = -nums[min];
        }
        return Arrays.stream(nums).sum();
    }
    public int getMin(int[] nums){
        int min = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[min]>nums[i]) min = i;
        }
        return min;
    }
}
