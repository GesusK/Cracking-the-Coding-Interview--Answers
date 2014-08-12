import java.util.Stack;

/**
 * Created by lenovo on 2014/7/29.
 * Just for testing code.
 */
public class TestJava {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<Integer>();
        a.push(3);
        a.push(null);
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
    }
}
