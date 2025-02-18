import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution93
 * 作者：tkj
 * 日期：2025/1/5
 * 描述：
 */
public class Solution93 {
    List<String> res = new ArrayList<String>();
    public List<String> restoreIpAddresses(String s) {
        backTrack(new StringBuilder(s),0,0);
        return res;
    }
    public void backTrack(StringBuilder s,int index,int cnt){
        if(cnt==3 && isValid(s.substring(index,s.length()))){
            res.add(s.toString());
            return;
        }
        if(cnt>3) return;
        for(int i = index;i<s.length();i++){
            if(isValid(s.substring(index,i+1))){
                s.insert(i+1,".");
                backTrack(s,i+2,cnt+1);
                s.deleteCharAt(i+1);
            }else{
                break;
            }
        }
    }
    public boolean isValid(String str){
        if(str.length()==0 || str.equals("")) return false;
        if(str.length()>3) return false;
        if(str.charAt(0)=='0' && str.length()>1) return false;
        if(Integer.parseInt(str)>255) return false;
        return true;
    }
}
