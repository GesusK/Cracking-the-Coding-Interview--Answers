package cc2_5;

import tools.MyNode;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by lenovo on 2014/8/2.
 */
public class FindCircular2 {

    public static void main(String[] args) {
        MyNode<Character> e = new MyNode<Character>('E', null);
        MyNode<Character> d = new MyNode<Character>('D', e);
        MyNode<Character> c = new MyNode<Character>('C', d);
        MyNode<Character> b = new MyNode<Character>('B', c);
        MyNode<Character> a = new MyNode<Character>('A', b);
        e.setNext(c);

        FindCircular2 fc2 = new FindCircular2();
        System.out.println(fc2.findCircular2(a).getValue());
    }

    private MyNode findCircular2(MyNode head) {
        MyNode p = head;
        MyNode q = head;
        while(p != null && p.getNext() != null) {
            p = p.getNext().getNext();
            q = q.getNext();
            if(p == q) {
                break;
            }
        }
        if(p == null || p.getNext() == null) {
            return null;
        }
        q = head;
        while(p != q) {
            p = p.getNext();
            q = q.getNext();
        }
        return p;
    }
}
