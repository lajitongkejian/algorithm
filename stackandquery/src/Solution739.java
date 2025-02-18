import java.util.LinkedList;

/**
 * 项目名称：algorithm
 * 类名称：Solution739
 * 作者：tkj
 * 日期：2025/2/18
 * 描述：
 */
public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        LinkedList<Integer> stack = new LinkedList<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            if(stack.isEmpty() || temperatures[stack.peek()]>=temperatures[i]){
                stack.push(i);
            }else{
                int index = stack.pop();
                ans[index] = i-index;
                i--;
            }
        }
        return ans;
    }
}
