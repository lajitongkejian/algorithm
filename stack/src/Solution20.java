/**
 * 项目名称：algorithm
 * 类名称：Solution20
 * 作者：tkj
 * 日期：2024/10/26
 */
public class Solution20 {
    public static boolean isValid(String s) {
        char a ;
        char[] stack = new char[s.length()];
        int top = 0;
        for(int i = 0;i<s.length();i++){
            a = s.charAt(i);
            if(a=='(' || a=='{' || a=='['){
                stack[top++] = a;
            }else if(a==')'){
                if(top>0 && stack[top-1]=='('){
                    top--;
                }else return false;
            }else if(a=='}'){
                if(top>0 && stack[top-1]=='{'){
                    top--;
                }else return false;
            }else{
                if(top>0 && stack[top-1]=='['){
                    top--;
                }else return false;
            }
        }
        if(top==0) return true;
        return false;
    }

    public static void main(String[] args) {
        String test = "()[]{}";
        boolean is = isValid(test);
        System.out.println(is);
    }
}
