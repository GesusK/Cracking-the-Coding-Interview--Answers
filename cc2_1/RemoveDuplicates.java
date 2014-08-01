package cc2_1;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by lenovo on 2014/8/1.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(2);

        RemoveDuplicates rd = new RemoveDuplicates();
        rd.removeDuplicates(list);
        System.out.println(list.toString());
    }

    private void removeDuplicates(LinkedList<Integer> list) {
        for(int i = 0; i < list.size()-1; i++) {
            for(int j = 0; j < i; j++) {
                if(list.get(i+1) == list.get(j)) {
                    list.remove(i+1);
                    i--;
                    break;
                }
            }
        }
    }
}
