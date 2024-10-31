import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution349
 * 作者：tkj
 * 日期：2024/10/31
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }
        int index = 0;
        for(int i = 0;i < nums2.length; i++){
            if(map.containsKey(nums2[i])){
                res[index++] = nums2[i];
                map.remove(nums2[i]);
            }
        }
        return Arrays.copyOfRange(res,0,index);
    }

}
