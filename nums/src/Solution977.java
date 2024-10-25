public class Solution977 {
    public static int[] sortedSquares(int[] nums) {
        int left = 0,right = nums.length-1,index = nums.length-1;
        int[] ans = new int[nums.length];
        while(index>=0){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ans[index--] = nums[left]*nums[left];
                left++;
            }else{
                ans[index--] = nums[right]*nums[right];
                right--;
            }
        }
        return ans;
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        sortedSquares(new int[]{-4,-1,0,3,10});
    }
}
