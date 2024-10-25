public class Solution59 {
    public static int[][] generateMatrix(int n) {

        //0:[0][0]-[0][n-1]  1:[1]][n-1]-[n-1][n-1] 2:[n-1][n-2]-
        int[][] arr = new int[n][n];
        int i = 0,j = 0;
        int cur = 0;
        for(int cnt = 0;cur!=n*n;cnt++){
             if(cnt%4==0){
                int tem = j;
                while(j<n-tem){
                    arr[i][j++] = ++cur;
                }
                j--;
                i++;
                continue;
            }
            if(cnt%4==1){
                int tem = i;
                while(i<n-tem){
                    arr[i++][j] = ++cur;
                }
                continue;
            }
            if(cnt%4==2){
                int tem = j;
                while(j>=n-tem-1){
                    arr[i][j--] = ++cur;
                }
                j++;
                i--;
                continue;
            }
            if(cnt%4==3){
                int tem = i;
                while(i>=n-tem-1){
                    arr[i--][j] = ++cur;
                }
                i++;
                j++;
                continue;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        generateMatrix(3);
    }
}
