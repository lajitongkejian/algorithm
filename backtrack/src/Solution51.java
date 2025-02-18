import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution51
 * 作者：tkj
 * 日期：2025/1/9
 * 描述：
 */
public class Solution51 {
    List<List<String>> res = new ArrayList<List<String>>();
    public List<List<String>> solveNQueens(int n) {
        int[][] used = new int[n][n];
        backTrack(n,new ArrayList<String>(),used);
        return res;
    }
    public void backTrack(int n,List<String> list,int[][] used){
        if(list.size() == n){
            res.add(new ArrayList<String>(list));
            return;
        }

        int index = list.size();
        for(int i = 0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            if(used[list.size()][i]==0){
                for(int j = 0;j<n;j++){
                    if(j==i) sb.append("Q");
                    else sb.append(".");
                }
                for(int j = 0;j+index<n;j++){
                    used[j+index][i]++;
                    if(index+j<n && i+j<n){
                        used[j+index][i+j]++;
                    }
                    if(index+j<n && i-j>=0){
                        used[j+index][i-j]++;
                    }
                }
                list.add(sb.toString());
                backTrack(n,list,used);
                list.remove(list.size()-1);
                for(int j = 0;j+index<n;j++){
                    used[j+index][i]--;
                    if(index+j<n && i+j<n){
                        used[index+j][i+j]--;
                    }
                    if(index+j<n && i-j>=0){
                        used[j+index][i-j]--;
                    }

                }
            }
        }
    }
}
