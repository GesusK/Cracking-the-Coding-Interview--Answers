package cc1_2;

/**
 * Created by lenovo on 2014/7/29.
 */
public class ReverseCStyleString {

    public static void main(String[] args) {
        char[] str = new char[]{'a','b','c','d','e','\n'};
        char[] str2 = new char[]{'a','b','c','d','\n'};

        ReverseCStyleString rcss = new ReverseCStyleString();

        System.out.print(str);
        System.out.print(str2);
        rcss.reverse(str);
        rcss.reverse(str2);
        System.out.print(str);
        System.out.print(str2);
    }

    private void reverse (char[] str) {
        int strLength = (str.length-1);
        for(int i = 0; i < strLength/2; i++) {
            char temp = str[i];
            str[i] = str[strLength-1-i];
            str[strLength-1-i] = temp;
        }
    }
}
