import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：algorithm
 * 类名称：Solution17
 * 作者：tkj
 * 日期：2025/1/4
 * 描述：
 */
public class Solution17 {
    Map<Character, String> map = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    List<String> res = new ArrayList<String>();
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.isEmpty()) return res;
        StringBuilder ans = new StringBuilder();
        backTrack(digits,ans,0);
        return res;
    }
    public void backTrack(String digits,StringBuilder ans,int index){
        if(index >= digits.length()){
            res.add(ans.toString());
            return;
        }
        String temp = map.get(digits.charAt(index));
        for(int i = 0;i<temp.length();i++){
            ans.append(temp.charAt(i));
            backTrack(digits,ans,index+1);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}
