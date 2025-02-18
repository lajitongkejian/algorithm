import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution131
 * 作者：tkj
 * 日期：2025/1/5
 * 描述：
 */
public class Solution131 {
    List<List<String>> res = new ArrayList<List<String>>();
    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<String>();
        trackBack(list,s,0);
        return res;
    }
    public void trackBack(List<String> list,String s,int index){
        if(index == s.length()){
            res.add(new ArrayList<String>(list));
            return;
        }
        String temp = "";
        for(int i = index;i<s.length();i++){
            temp+=s.charAt(i);
            if(judge(temp)){
                list.add(temp);
                trackBack(list,s,i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean judge(String str){
        for(int i = 0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }

}
