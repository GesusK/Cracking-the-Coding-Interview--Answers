package cc2_3;

import tools.MyNode;

/**
 * Created by lenovo on 2014/8/1.
 */
public class DeleteMiddle {
    public static void main(String[] args) {
        MyNode<Integer> e = new MyNode<Integer>(5, null);
        MyNode<Integer> d = new MyNode<Integer>(4, e);
        MyNode<Integer> c = new MyNode<Integer>(3, d);
        MyNode<Integer> b = new MyNode<Integer>(2, c);
        MyNode<Integer> a = new MyNode<Integer>(1, b);

        DeleteMiddle dm = new DeleteMiddle();
        dm.deleteMiddle(c);

        MyNode<Integer> p = a;
        while(p != null) {
            System.out.print(p.getValue() + " ");
            p = p.getNext();
        }
    }

    private void deleteMiddle(MyNode m) {
        if(m == null) {
            return;
        }
        if(m.getNext() == null) {
            //In this situation we can do nothing.
            return;
        }
        m.setValue(m.getNext().getValue());
        m.setNext(m.getNext().getNext());
    }
}
