/**
 * 项目名称：algorithm
 * 类名称：Solution738
 * 作者：tkj
 * 日期：2025/1/24
 * 描述：
 */
public class Solution738 {
    public int monotoneIncreasingDigits(int n) {
        String str = String.valueOf(n);
        char[] c = str.toCharArray();
        int prev = c.length-1;
        // boolean nine = false;
        int temp = c.length;
        for(int i = c.length-2;i>=0;i--){
            if(c[prev] < c[i]){
                c[i] -= 1;
                c[prev] = '9';
                temp = prev;
            }
            prev = i;
        }
        for(int i = temp+1;i<c.length;i++){
            c[i] = '9';
        }
        return Integer.parseInt(String.valueOf(c));
    }
}
