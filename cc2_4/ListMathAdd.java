package cc2_4;

import tools.MyNode;

/**
 * Created by lenovo on 2014/8/1.
 */
public class ListMathAdd {

    public static void main(String[] args) {
        MyNode<Integer> c = new MyNode<Integer>(5, null);
        MyNode<Integer> b = new MyNode<Integer>(1, c);
        MyNode<Integer> a = new MyNode<Integer>(3, b);

        MyNode<Integer> c1 = new MyNode<Integer>(2, null);
        MyNode<Integer> b1 = new MyNode<Integer>(9, c1);
        MyNode<Integer> a1 = new MyNode<Integer>(5, b1);

        ListMathAdd lma = new ListMathAdd();
        MyNode<Integer> res = lma.listMathAdd(a, a1);

        MyNode<Integer> p = res;
        while(p != null) {
            System.out.print(p.getValue() + " ");
            p = p.getNext();
        }
    }

    private MyNode listMathAdd(MyNode<Integer> num0, MyNode<Integer> num1) {
        if(num0 == null) {
            return num1;
        }
        if(num1 == null) {
            return num0;
        }
        MyNode<Integer> res = new MyNode<Integer>(0, null);
        MyNode<Integer> t = res;
        MyNode<Integer> p = num0;
        MyNode<Integer> q = num1;
        boolean carry = false;
        while(p != null || q != null) {
            int temp = ((p!=null)?p.getValue():0) + ((q!=null)?q.getValue():0) + (carry?1:0);
            if(temp < 10) {
                carry = false;
            }else {
                temp -= 10;
                carry = true;
            }
            MyNode<Integer> newNode = new MyNode<Integer>(temp, null);
            t.setNext(newNode);
            t = t.getNext();
            if(p != null) {
                p = p.getNext();
            }
            if(q != null) {
                q = q.getNext();
            }
        }
        if(carry) {
            MyNode<Integer> newNode = new MyNode<Integer>(1, null);
            t.setNext(newNode);
        }
        return res.getNext();
    }
}
