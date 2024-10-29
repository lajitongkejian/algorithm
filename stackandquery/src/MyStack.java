/**
 * 项目名称：algorithm
 * 类名称：MyStack
 * 作者：tkj
 * 日期：2024/10/29
 * leetcode 225 用队列实现栈
 */
/*
    push:t1 = 2 h1 = 0 h2 = 0 t2 = 0
    pop: h1
 */
public class MyStack {
   int head1 = 0;
   int head2 = 0;
   int tail1 = 0;
   int tail2 = 0;
   int[] queue1 =  new int[100];
   int[] queue2 =  new int[100];

    public MyStack() {

    }

    public void push(int x) {
        queue1[tail1] = x;
        tail1 = (tail1+1)%100;
    }

    public int pop() {
        while((tail1 - head1 + 100)%100!=1){
            queue2[tail2] = queue1[head1];
            head1 = (head1+1)%100;
            tail2 = (tail2+1)%100;
        }
        int ans = queue1[head1];
        head1 = (head1+1)%100;
        while(head2 != tail2){
            queue1[tail1] = queue2[head2];
            head2 = (head2+1)%100;
            tail1 = (tail1+1)%100;
        }
        return ans;
    }

    public int top() {
        return queue1[(tail1+99)%100];
    }

    public boolean empty() {
        return tail1==head1;
    }
}
