public class Solution27 {
    public static int removeElement(int[] nums, int val) {
        int l = nums.length-1;
        int cnt = 0;
        for(int i = 0;i<nums.length;i++){
            if(i>=l){
                break;
            }
            while(i<l){
                if(nums[l]!=val) break;
                else {
                    l--;
                    cnt++;
                }
            }
            if(nums[i]==val){
                swap(nums,i,l);
                l--;
                cnt++;
            }
        }
        return cnt;
    }
    public static void swap(int[] nums,int i,int j){
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        removeElement(nums,2);
    }
}
