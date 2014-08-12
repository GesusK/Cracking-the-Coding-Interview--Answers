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
    }

    public void sort(Stack<Integer> stack0) {
        int n = stack0.size();
        Stack<Integer> stack1 = new Stack<Integer>();
        int i = 0;
        int j = 0;
    }
}
