/**
 * 项目名称：algorithm
 * 类名称：Solution150
 * 作者：tkj
 * 日期：2024/10/29
 */
public class Solution150 {
    public int evalRPN(String[] tokens) {
        int top = 0;
        int[] stack = new int[tokens.length];
        for(String str : tokens) {
            if(str.matches("^(?:0|(?:-?[1-9]\\d*))$")){
                stack[top++] = Integer.parseInt(str);
            }else {
                int a = stack[--top];
                int b = stack[--top];
                if(str.equals("+")){
                    stack[top++] = a + b;
                } else if (str.equals("-")) {
                    stack[top++] = b - a;
                } else if (str.equals("*")) {
                    stack[top++] = a * b;
                }else{
                    stack[top++] = b / a;
                }
            }
        }
        return stack[0];
    }
}
