package tools;

/**
 * Created by lenovo on 2014/8/1.
 */
public class MyNode<T> {
    private T value;
    private MyNode<T> next;

    public MyNode(T value, MyNode<T> next) {
        this.setValue(value);
        this.setNext(next);
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
