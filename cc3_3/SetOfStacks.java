package cc3_3;

import java.util.Stack;

/**
 * Created by lenovo on 2014/8/5.
 */
public class SetOfStacks<T> {
    private final int numOfStacks;
    private final int stackCapacity;
    private Stack<T>[] stackArr;
    private int cur;

    public SetOfStacks() {
        numOfStacks = 10;
        stackCapacity = 3;
        stackArr = new Stack[numOfStacks];
        cur = 0;
        stackArr[cur] = new Stack<T>();
    }

    public boolean push(T obj) {
        if(cur == numOfStacks-1 && stackArr[cur].size() == stackCapacity) {
            return false;
        }
        if(stackArr[cur].size() == stackCapacity) {
            stackArr[++cur] = new Stack<T>();
        }
        stackArr[cur].push(obj);
        return true;
    }

    public T pop() {
        if(cur == 0 && stackArr[cur].size() == 0) {
            return null;
        }
        if(stackArr[cur].size() == 0) {
            stackArr[cur] = null;
            return stackArr[--cur].pop();
        }
        return  stackArr[cur].pop();
    }

    public T popAt(int index) {
        if(index < 0 || index > numOfStacks-1) {
            return null;
        }
        return stackArr[index]==null?null:stackArr[index].pop();
    }
}
