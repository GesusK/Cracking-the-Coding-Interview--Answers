package cc3_5;

import java.util.Stack;

/**
 * Created by lenovo on 2014/8/12.
 */
public class MyQueue<T> {
    private Stack<T> stackAdding;
    private Stack<T> stackRemoving;
    private boolean lastAdding;

    public MyQueue() {
        this.stackAdding = new Stack<T>();
        this.stackRemoving = new Stack<T>();
        this.lastAdding = true;
    }

    public void add(T t) {
        if(!lastAdding) {
            while(!stackRemoving.empty()) {
                stackAdding.push(stackRemoving.pop());
            }
            lastAdding = true;
        }
        stackAdding.push(t);
    }

    public T remove() {
        if(lastAdding) {
            while(!stackAdding.empty()) {
                stackRemoving.push(stackAdding.pop());
            }
            lastAdding = false;
        }
        return stackRemoving.pop();
    }
}
