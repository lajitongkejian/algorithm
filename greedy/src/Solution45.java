/**
 * 项目名称：algorithm
 * 类名称：Solution45
 * 作者：tkj
 * 日期：2025/1/22
 * 描述：
 */
public class Solution45 {
    public int jump(int[] nums) {
        int res = 0;
        if(nums.length<=1) return 0;
        int index = 0;
        while(index < nums.length){
            int max = 0;
            int next = index;
            for(int j = 1;j<=nums[index];j++){
                if(j+index>=nums.length-1) return res+1;
                if(max <= nums[index+j]+index+j){
                    max = nums[index+j]+index+j;
                    next = index+j;
                }
            }
            res++;
            index = next;
        }
        return res;
    }
}
