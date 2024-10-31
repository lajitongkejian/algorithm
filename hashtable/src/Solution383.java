import java.util.HashMap;

/**
 * 项目名称：algorithm
 * 类名称：Solution383
 * 作者：tkj
 * 日期：2024/10/31
 */
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            Character c = ransomNote.charAt(i);
            if(map.containsKey(c) && map.get(c)>0) {
                map.put(c,map.get(c)-1);
            }else return false;
        }
        return true;
    }
}
