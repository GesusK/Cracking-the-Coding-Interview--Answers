package cc2_1;

import tools.MyNode;

/**
 * Created by lenovo on 2014/8/1.
 */
public class RemoveDuplicates2 {

    public static void main(String[] args) {
        MyNode<Integer> e = new MyNode<Integer>(3, null);
        MyNode<Integer> d = new MyNode<Integer>(5, e);
        MyNode<Integer> c = new MyNode<Integer>(1, d);
        MyNode<Integer> b = new MyNode<Integer>(3, c);
        MyNode<Integer> a = new MyNode<Integer>(1, b);

        RemoveDuplicates2 rd2 = new RemoveDuplicates2();
        rd2.removeDuplicates2(a);

        MyNode<Integer> p = a;
        while(p != null) {
            System.out.print(p.getValue() + " ");
            p = p.getNext();
        }
    }

    private void removeDuplicates2(MyNode head) {
        //Maybe we can use hash to reduce time cost, but here we don't use it.
        MyNode p = new MyNode(null, head);
        while(p.getNext() != null) {
            p = p.getNext();
            MyNode t = p;
            while(t.getNext() != null) {
                if(p.getValue() == t.getNext().getValue()) {
                    t.setNext(t.getNext().getNext());
                }else {
                    t = t.getNext();
                }
            }
        }
    }
}
