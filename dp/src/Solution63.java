/**
 * 项目名称：algorithm
 * 类名称：Solution63
 * 作者：tkj
 * 日期：2024/12/17
 * 描述：
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[] dp = new int[obstacleGrid[0].length];
        for(int i = 0;i<obstacleGrid[0].length;i++) {
            if(obstacleGrid[0][i]==0) dp[i] = 1;
            else break;
        }
        for(int i = 1;i < obstacleGrid.length;i++){
            for(int j = 0;j < obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==1){
                    dp[j] = 0;
                }else if(j!=0){
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[dp.length-1];
    }
}
