import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution452
 * 作者：tkj
 * 日期：2025/1/24
 * 描述：
 */
public class Solution452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a, b) -> {
            if(a[0]==b[0]) return Integer.compare(a[1],b[1]);
            return Integer.compare(a[0],b[0]);
        });
        int res = 1;
        int aim = points[0][1];
        for(int i = 1;i<points.length;i++){
            if(aim >= points[i][0]) aim = Math.min(aim,points[i][1]);
            else{
                res++;
                aim = points[i][1];
            }
        }
        return res;
    }
}
