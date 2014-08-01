package cc2_2;

import tools.MyNode;

/**
 * Created by lenovo on 2014/8/1.
 */
public class Nth2Last {

    public static void main(String[] args) {
        MyNode<Integer> e = new MyNode<Integer>(5, null);
        MyNode<Integer> d = new MyNode<Integer>(4, e);
        MyNode<Integer> c = new MyNode<Integer>(3, d);
        MyNode<Integer> b = new MyNode<Integer>(2, c);
        MyNode<Integer> a = new MyNode<Integer>(1, b);

        Nth2Last n2l = new Nth2Last();
        MyNode<Integer> out = n2l.nth2Last(a, 2);
        System.out.println(out.getValue());
    }

    private MyNode nth2Last(MyNode head, int n) {
        if(head == null || n < 1) {
            return null;
        }

        MyNode p = head;
        MyNode q = null;
        int count = 1;
        while(p != null) {
            p = p.getNext();
            if(q != null) {
                q = q.getNext();
            }
            if(count == n) {
                q = head;
            }
            count++;
        }
        return q;
    }
}
