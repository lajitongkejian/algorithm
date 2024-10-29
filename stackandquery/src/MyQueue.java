/**
 * 项目名称：algorithm
 * 类名称：MyQueue
 * 作者：tkj
 * 日期：2024/10/29
 * leetcode232
 */
public class MyQueue {
    int top1 = 0;
    int top2 = 0;
    int[] stack1 = new int[100];
    int[] stack2 = new int[100];
    public MyQueue() {

    }

    public void push(int x) {
        stack1[top1++] = x;
    }

    public int pop() {
        while (top1!=0){
            stack2[top2++] = stack1[--top1];
        }
        int ans = stack2[--top2];
        while (top2!=0){
            stack1[top1++] = stack2[--top2];
        }
        return ans;
    }

    public int peek() {
        while (top1!=0){
            stack2[top2++] = stack1[--top1];
        }
        int ans = stack2[top2-1];
        while (top2!=0){
            stack1[top1++] = stack2[--top2];
        }
        return ans;
    }

    public boolean empty() {
        return top1==0;
    }
}
