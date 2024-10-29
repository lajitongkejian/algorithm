/**
 * 项目名称：algorithm
 * 类名称：Solution231
 * 作者：tkj
 * 日期：2024/10/29
 * 这是n为2的幂的必要性，我论证一下充分性： n & n-1可以把n最低位的1变0，而当n & n-1 == 0时，则说明n只有一个1。
 */
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1)) == 0;
    }
}
