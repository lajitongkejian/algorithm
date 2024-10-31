import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：algorithm
 * 类名称：Solution1
 * 作者：tkj
 * 日期：2024/10/31
 */
public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!= i) {
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution1.twoSum(new int[]{2, 7, 11, 15}, 9);
    }
}
