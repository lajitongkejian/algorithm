import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution332
 * 作者：tkj
 * 日期：2025/1/9
 * 描述：
 */
public class Solution332 {
    List<String> res = new ArrayList<String>();
    public List<String> findItinerary(List<List<String>> tickets) {
        Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));
        boolean[] used = new boolean[tickets.size()];
        List<String> list = new ArrayList<String>();
        list.add("JFK");
        backTrack("JFK",used,tickets,list);
        return res;
    }
    public boolean backTrack(String from,boolean[] used,List<List<String>> tickets,List<String> list){
        if(list.size() == tickets.size()+1){
            res = new ArrayList(list);
            return true;
        }
        String to = "";
        for(int i = 0;i<tickets.size();i++){
            if(!used[i] && tickets.get(i).get(0).equals(from) && !to.equals(tickets.get(i).get(1))){
                used[i] = true;
                list.add(tickets.get(i).get(1));
                if(backTrack(tickets.get(i).get(1),used,tickets,list)) return true;
                list.remove(list.size()-1);
                used[i] = false;
                to = tickets.get(i).get(1);
            }
        }
        return false;
    }
}
