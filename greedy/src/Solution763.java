import java.util.*;

/**
 * 项目名称：algorithm
 * 类名称：Solution763
 * 作者：tkj
 * 日期：2025/1/24
 * 描述：
 */
public class Solution763 {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        int res = 0;
        for(int i = 0;i<s.length();i++){
            res = Math.max(res,map.get(s.charAt(i)));
            if(res == i){
                list.add(i);
            }
        }
        return list;
    }
}
