/**
 * 项目名称：algorithm
 * 类名称：Solution135
 * 作者：tkj
 * 日期：2025/1/24
 * 描述：
 */
public class Solution135 {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        candy[0] = 1;
        for(int i = 1;i<ratings.length;i++){
            if(ratings[i] > ratings[i-1]) candy[i] = candy[i-1]+1;
            else candy[i] = 1;
        }
        int sum = candy[ratings.length-1];
        for(int i = ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]) candy[i] = Math.max(candy[i+1]+1,candy[i]);
            sum+=candy[i];
        }
        return sum;
    }
}
