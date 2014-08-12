package cc3_6;

import java.util.Stack;

/**
 * Created by lenovo on 2014/8/12.
 */
public class SortStack {

    public static void main(String[] args) {
        SortStack ss = new SortStack();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(5);
        stack.push(4);
        stack.push(2);
        stack.push(2);
        stack.push(3);
        stack.push(9);
        ss.sort(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    public void sort(Stack<Integer> stack0) {
        // bidirectional sort
        int n = stack0.size();
        Stack<Integer> stack1 = new Stack<Integer>();
        int i = 0;
        int j = 0;
        boolean isStack0 = true;
        while(i+j != n) {
            if(isStack0) {
                int count = 0;
                int tempMin = 999999;
                while(count < n-i-j) {
                    int num = stack0.pop();
                    if(num < tempMin) {
                        if(count != 0) {
                            stack1.push(tempMin);
                        }
                        tempMin = num;
                    }else {
                        stack1.push(num);
                    }
                    count++;
                }
                stack0.push(tempMin);
                isStack0 = false;
                i++;
            }else {
                int count = 0;
                int tempMax = -1;
                while(count < n-j-i) {
                    int num = stack1.pop();
                    if(num > tempMax) {
                        if(count != 0) {
                            stack0.push(tempMax);
                        }
                        tempMax = num;
                    }else {
                        stack0.push(num);
                    }
                    count++;
                }
                stack1.push(tempMax);
                isStack0 = true;
                j++;
            }
        }
        while(!stack1.empty()) {
            stack0.push(stack1.pop());
        }
    }
}
