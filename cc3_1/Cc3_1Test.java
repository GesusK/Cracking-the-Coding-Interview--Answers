package cc3_1;

/**
 * Created by lenovo on 2014/8/3.
 */
public class Cc3_1Test {
    public static void main(String[] args) {
        StacksByArray sba = new StacksByArray();
        sba.pushA(1);
        sba.pushB(2);
        sba.pushC(3);
        System.out.println(sba.popB());
        sba.pushC(4);
        System.out.println(sba.popA());
        System.out.println(sba.popC());
        System.out.println(sba.popC());
    }
}
