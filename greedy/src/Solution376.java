/**
 * 项目名称：algorithm
 * 类名称：Solution376
 * 作者：tkj
 * 日期：2024/12/26
 * 描述：
 */
public class Solution376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 1) return 1;
        int index = 0;
        int res = 1;
        while(index < nums.length-1 && nums[index+1]==nums[index]) index++;
        if(index == nums.length-1) return res;
        boolean flag = nums[index+1] > nums[index];//下一个要找大数
        while(index < nums.length-1){
            if(flag && nums[index+1] > nums[index]){
                res++;
                flag = false;
            }
            else if(!flag && nums[index+1] < nums[index]){
                res++;
                flag = true;
            }
            index++;
        }
        return res;
    }
}
