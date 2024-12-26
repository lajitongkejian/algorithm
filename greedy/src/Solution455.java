import java.util.Arrays;

/**
 * 项目名称：algorithm
 * 类名称：Solution455
 * 作者：tkj
 * 日期：2024/12/26
 * 描述：
 */
public class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int j = 0;
        for(int i = 0;i<s.length && j<g.length;i++){
            if(s[i]>=g[j]){
                res++;
                j++;
            }
        }
        return res;
    }
}
