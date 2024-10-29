import java.util.LinkedList;

/**
 * 项目名称：algorithm
 * 类名称：Solution239
 * 作者：tkj
 * 日期：2024/10/29
 */
public class Solution239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        int right = 0;
        while (right < nums.length) {
            if(!queue.isEmpty() && nums[queue.peek()] < nums[right]){
                queue.clear();
                queue.add(right++);
            }
            if(queue.size() >= k){
                queue.poll();
            }
            if(right>k-1){
                res[index++] = nums[queue.peek()];
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,3,-1,-3,5,3,6,7};
        int[] res = maxSlidingWindow(test, 3);
        System.out.println(test);
    }
}
