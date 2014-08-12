package cc3_5;

/**
 * Created by lenovo on 2014/8/12.
 */
public class Cc3_5Test {
    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<Integer>();
        mq.add(1);
        mq.add(2);
        mq.add(3);
        mq.add(4);
        System.out.println(mq.remove());
        System.out.println(mq.remove());
        mq.add(5);
        System.out.println(mq.remove());
        System.out.println(mq.remove());
        System.out.println(mq.remove());
    }
}
