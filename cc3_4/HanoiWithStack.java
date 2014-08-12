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

//        s.push(new Floor(n-1, b, a, c, (n==2?true:false)));
//        s.push(new Floor(n, a, b, c, true));
//        s.push(new Floor(n-1, a, c, b, (n==2?true:false)));
        s.push(new Floor(n, 'A', 'B', 'C', false));

        while(!s.empty()) {
            Floor f = s.pop();
            if(f.single) {
                System.out.println("Move "+f.fl+" from "+f.a+" to "+f.c+".");
            }else {
                s.push(new Floor(f.fl-1, f.b, f.a, f.c, (f.fl==2?true:false)));
                s.push(new Floor(f.fl, f.a, f.b, f.c, true));
                s.push(new Floor(f.fl-1, f.a, f.c, f.b, (f.fl==2?true:false)));
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
