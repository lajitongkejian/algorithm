/**
 * 项目名称：algorithm
 * 类名称：Solution134
 * 作者：tkj
 * 日期：2025/1/23
 * 描述：
 */
public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curGas = 0;
        int start = 0;
        int sum = gas[0]-cost[0];
        int min = sum;
        for(int i = 1;i<gas.length;i++){
            sum += gas[i]-cost[i];
            min = Math.min(min,sum);
        }
        if(sum<0) return -1;
        if(min>0) return 0;
        for(int i = 0;i<gas.length;i++){
            curGas += gas[i]-cost[i];
            if(curGas < 0 ){
                start = (i+1)%gas.length;
                curGas = 0;
            }
        }
        return start;
    }
}
