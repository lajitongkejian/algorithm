import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * 项目名称：algorithm
 * 类名称：Solution406
 * 作者：tkj
 * 日期：2025/1/24
 * 描述：
 */
public class Solution406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            else return b[0]-a[0];
        });
        LinkedList<int[]> res = new LinkedList<int[]>();
        for(int[] p : people){
            res.add(p[1],p);
        }
        return res.toArray(new int[people.length][]);
    }
}
