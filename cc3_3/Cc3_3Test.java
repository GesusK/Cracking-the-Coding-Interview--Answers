package cc3_3;

/**
 * Created by lenovo on 2014/8/8.
 */
public class Cc3_3Test {
    public static void main(String[] args) {
        SetOfStacks<Integer> sos = new SetOfStacks<Integer>();
        sos.push(1);
        sos.push(2);
        sos.push(3);
        sos.push(4);
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        sos.push(5);
        sos.push(6);
        System.out.println(sos.popAt(0));
        System.out.println(sos.pop());
        System.out.println(sos.pop());
    }
}
