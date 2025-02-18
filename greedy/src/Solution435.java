import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution435
 * 作者：tkj
 * 日期：2025/1/24
 * 描述：
 */
public class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
            return Integer.compare(a[0],b[0]);
        });
        int res = 1;
        int end = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(end <= intervals[i][0]){
                res++;
                end = intervals[i][1];
            }
            else{
                end = Math.min(intervals[i][1],end);
            }

        }
        return intervals.length - res;
    }
}
