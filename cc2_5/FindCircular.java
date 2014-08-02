package cc2_5;

import tools.MyNode;

/**
 * Created by lenovo on 2014/8/2.
 */
public class FindCircular {

    public static void main(String[] args) {
        MyNode<Character> e = new MyNode<Character>('E', null);
        MyNode<Character> d = new MyNode<Character>('D', e);
        MyNode<Character> c = new MyNode<Character>('C', d);
        MyNode<Character> b = new MyNode<Character>('B', c);
        MyNode<Character> a = new MyNode<Character>('A', b);
        e.setNext(c);

        FindCircular fc = new FindCircular();
        System.out.println(fc.findCircular(a).getValue());
    }

    private MyNode findCircular(MyNode head) {
        MyNode p = head;
        MyNode res = null;
        while(this.isCircular(p)) {
            if(res == null) {
                res = new MyNode(0, null);
            }
            res.setNext(p);
            res = p;
            MyNode q = p.getNext();
            p.setNext(null);
            p = q;
        }
        if(res != null) {
            res.setNext(p);
            return res;
        }else {
            return null;
        }
    }
    /**
     * simplest method to judge whether a linked list is circular or not
     * @param head
     * @return boolean
     */
    private boolean isCircular(MyNode head) {
        int count = 0;
        MyNode p = head;
        while(count++ < 100) {
            if(p == null) {
                return false;
            }
            p = p.getNext();
        }
        return true;
    }
}
