package cc3_2;


/**
 * Created by lenovo on 2014/8/4.
 */
public class Cc3_2Test {
    public static void main(String[] args) {
        StackWithMin swm = new StackWithMin();
        swm.push(11);
        swm.push(12);
        swm.push(13);
        System.out.println(swm.min());
        swm.push(9);
        System.out.println(swm.min());
        swm.push(3);
        System.out.println(swm.min());
        System.out.println(swm.pop());
        System.out.println(swm.min());
        System.out.println(swm.pop());
        System.out.println(swm.min());
        System.out.println(swm.pop());
        System.out.println(swm.min());
    }
}
