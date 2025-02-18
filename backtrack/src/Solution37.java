import java.util.HashSet;

/**
 * 项目名称：algorithm
 * 类名称：Solution37
 * 作者：tkj
 * 日期：2025/1/9
 * 描述：
 */
public class Solution37 {
    public static void solveSudoku(char[][] board) {
        backTrack(board,0,0);
    }
    public static boolean backTrack(char[][] board,int row,int col){
        if(row == 8 && col == 9) {
            return true;
        }
        if(col == 9){
            return backTrack(board,row+1,0);
        }
        if(board[row][col]!='.'){
            return backTrack(board,row,col+1);
        }
        HashSet<Character> used = new HashSet<Character>();
        int rowIndex = row/3;
        int colIndex = col/3;
        for(int j = 0;j<9;j++){
            used.add(board[row][j]);
            used.add(board[j][col]);
            used.add(board[rowIndex*3+j/3][colIndex*3+j%3]);
        }
        for(char i = '1';i<='9';i++){
            if(!used.contains(i)){
                board[row][col] = i;
                if(backTrack(board,row,col+1)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board);
//        System.out.println(board);
    }
}
