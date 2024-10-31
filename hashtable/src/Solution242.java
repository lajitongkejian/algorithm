import java.util.HashMap;
import java.util.Iterator;

/**
 * 项目名称：algorithm
 * 类名称：Solution242
 * 作者：tkj
 * 日期：2024/10/31
 */
public class Solution242 {
    public static boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            if(map1.containsKey(t.charAt(i)) && map1.get(t.charAt(i)) != 0){
                map1.put(t.charAt(i),map1.get(t.charAt(i))-1);
            }else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution242.isAnagram("rat","car");
    }
}
