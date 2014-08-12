package cc3_4;

import java.util.Stack;

/**
 * Created by lenovo on 2014/8/12.
 */
public class HanoiWithStack {

    public static void main(String[] args) {
        HanoiWithStack hws = new HanoiWithStack();
        hws.process(5);
    }

    public void process(int n) {
        if(n == 1) {
            System.out.println("Move 1 from A to C.");
        }else if(n < 1) {
            System.out.println("n should be larger than 0.");
        }
        Stack<Floor> s = new Stack<Floor>();
        char a = 'A';
        char b = 'B';
        char c = 'C';

        s.push(new Floor(n-1, b, a, c, (n==2?true:false)));
        s.push(new Floor(n, a, b, c, true));
        s.push(new Floor(n-1, a, c, b, (n==2?true:false)));

        while(s.size() != 0) {
            Floor f = s.pop();
            if(f.single) {
                System.out.println("Move "+f.fl+" from "+f.a+" to "+f.c+".");
            }else {
                int nn = f.fl;
                char aa = f.a;
                char bb = f.b;
                char cc =f.c;
                s.push(new Floor(nn-1, bb, aa, cc, (nn==2?true:false)));
                s.push(new Floor(nn, aa, bb, cc, true));
                s.push(new Floor(nn-1, aa, cc, bb, (nn==2?true:false)));
            }
        }
    }

    public class Floor {
        public int fl;
        public char a;
        public char b;
        public char c;
        public boolean single;
        public Floor(int fl, char a, char b, char c, boolean single) {
            this.fl = fl;
            this.a = a;
            this.b = b;
            this.c = c;
            this.single = single;
        }
    }
}
