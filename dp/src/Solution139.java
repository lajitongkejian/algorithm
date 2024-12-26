import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：algorithm
 * 类名称：Solution139
 * 作者：tkj
 * 日期：2024/12/25
 * 描述：
 * 完全背包问题顺序问题
 * 1.为什么求组合是先遍历物品后遍历背包？
 * 因为组合不在意顺序，先遍历物品的话就提前约定了一个默认顺序，而且顺序唯一
 * 如果调换遍历顺序，那么会导致多算重复情况比如{1，2}和{2，1}
 * 2.为什么求顺序是先遍历背包再遍历物品？
 * 因为顺序导致物品具有次序，故在每个背包位置时都需要试一次物品放入，这样才能产生多种次序，而不是求组合就默认了物品顺序就是物品表的顺序
 * 3.求最值问题
 * 无所谓遍历顺序，{1，2}和{2，1}由组合得到的最值问题结果都是一样的，只要保证dp在状态转移时，使用的值是经过本轮更新的即可
 * 0-1背包问题
 * 每次遍历的内部顺序有所谓，不能使用本轮更新计算的值，如果使用从头到尾的内部顺序，则会导致后续会放入物品两次，而完全背包没有次数限制
 * 所以要使用的是本轮更新的值，是从头到尾遍历
 */
public class Solution139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1;i<s.length()+1;i++){
            for(String str:wordDict){
                if((i+str.length()-1<s.length()+1) && !dp[i+str.length()-1]){
                    dp[i+str.length()-1] = dp[i-1] && s.substring(i-1,i-1+str.length()).equals(str) ;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<String>();
        wordDict.add("apple");
        wordDict.add("pen");
        System.out.println(wordBreak("applepenapple",wordDict));
    }
}
