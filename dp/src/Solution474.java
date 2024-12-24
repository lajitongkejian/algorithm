import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution474
 * 作者：tkj
 * 日期：2024/12/24
 * 描述：
 */
public class Solution474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int size = strs.length;
        int[][] dp = new int[m+1][n+1];
        for(String s:strs){
            int num0 = 0;
            int num1 = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='0') num0++;
                else num1++;
            }
            for(int j = m ;j >= num0;j-- ){
                for(int k = n;k >= num1;k--){
                    dp[j][k] = Math.max(dp[j][k],dp[j-num0][k-num1]+1);
                }
            }
        }
        return dp[m][n];


    }


}
