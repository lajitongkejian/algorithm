/**
 * 项目名称：algorithm
 * 类名称：Solution263
 * 作者：tkj
 * 日期：2024/10/29
 */
public class Solution263 {
    public boolean isUgly(int n) {
        while(n%2==0){
            if(n==0) return false;
            n = n/2;
        }
        while(n%3 == 0){
            if(n==0) return false;
            n = n/3;
        }
        while(n%5 == 0){
            if(n==0) return false;
            n = n/5;
        }
        if(n==1) return true;
        return false;
    }
}
