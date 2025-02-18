/**
 * 项目名称：algorithm
 * 类名称：Solution860
 * 作者：tkj
 * 日期：2025/1/24
 * 描述：
 */
public class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int[] change = new int[2];
        for(int i = 0;i<bills.length;i++){
            if(bills[i]==5) change[0]++;
            if(bills[i]==10){
                if(change[0]>0){
                    change[0]--;
                    change[1]++;
                }else return false;
            }
            if(bills[i]==20){
                if(change[1]>0 && change[0]>0){
                    change[0]--;
                    change[1]--;
                }else if(change[0]>2){
                    change[0] -= 3;
                }else return false;
            }
        }
        return true;
    }
}
