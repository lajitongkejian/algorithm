/**
 * 项目名称：algorithm
 * 类名称：Solution392
 * 作者：tkj
 * 日期：2024/12/31
 * 描述：
 */
public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) return true;
        int index = 0;
        boolean res = false;
        for(int i = 0;i<s.length();i++){
            res = false;
            for(int j = index;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    index = j+1;
                    res = true;
                    break;
                }else{
                    res = false;
                }
            }
            if(!res) return false;
        }
        return res;
    }
}
