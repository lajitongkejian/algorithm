import java.util.*;

/**
 * 项目名称：algorithm
 * 类名称：Solution7
 * 作者：tkj
 * 日期：2024/10/31
 */
public class Solution15a {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int prev1 = 100001;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == prev1) continue;
            HashMap<Integer,Integer> map = new HashMap<>();
            int prev2 = 100002;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == prev2) continue;
                if(map.containsKey(-nums[i]-nums[j])) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(-nums[i]-nums[j]);
                    res.add(list);
                    prev2 = nums[j];
                }
                map.put(nums[j],nums[j]);

            }
            prev1 = nums[i];
        }
        return res;
    }
}
