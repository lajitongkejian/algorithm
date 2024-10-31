import java.util.HashMap;

/**
 * 项目名称：algorithm
 * 类名称：Solution202
 * 作者：tkj
 * 日期：2024/10/31
 */
public class Solution202 {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        while(n!=1){
            while(n>0) {
                sum+= Math.pow(n%10,2);
                n = n/10;
            }
            if(map.containsKey(sum)) return false;
            map.put(sum,sum);
            n = sum;
            sum = 0;
        }
        return true;
    }
}
