package cc3_5;

import java.util.Stack;

/**
 * Created by lenovo on 2014/8/12.
 */
public class MyQueue<T> {
    private Stack<T> stackAdding;
    private Stack<T> stackRemoving;

    public MyQueue() {
        this.stackAdding = new Stack<T>();
        this.stackRemoving = new Stack<T>();
    }

    public void add(T t) {
        stackAdding.push(t);
    }

    public T remove() {
        if(stackRemoving.empty()) {
            while(!stackAdding.empty()) {
                stackRemoving.push(stackAdding.pop());
            }
        }
        return stackRemoving.pop();
    }
}
