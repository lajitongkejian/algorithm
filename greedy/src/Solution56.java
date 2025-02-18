import java.util.Arrays;
import java.util.LinkedList;

/**
 * 项目名称：algorithm
 * 类名称：Solution56
 * 作者：tkj
 * 日期：2025/1/24
 * 描述：
 */
public class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> {
            return Integer.compare(a[0],b[0]);
        });
        LinkedList<int[]> res = new LinkedList<int[]>();
        int end = intervals[0][1];
        int start = intervals[0][0];
        for(int i = 1;i<intervals.length;i++){
            if(end >= intervals[i][0]){
                end = Math.max(end,intervals[i][1]);
            }else{
                res.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][]);
    }
}
