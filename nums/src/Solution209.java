public class Solution209 {
    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0,right = 0;
        int sum = 0;
        int cnt = 0;
        int min = nums.length;
        while(right< nums.length || sum >= target){
            if(sum < target){
                sum+= nums[right++];
                cnt++;
            }
            if(sum >= target){
                if(cnt<min){
                    min = cnt;
                }
                sum-= nums[left++];
                cnt--;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
}
