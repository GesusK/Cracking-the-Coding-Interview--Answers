package cc1_4;

/**
 * Created by lenovo on 2014/7/30.
 */
public class DecideAnagrams {

    public static void main(String[] args) {
        String str0 = "123qwe";
        String str1 = "w3eq12";
        String str2 = "qwe233";

        DecideAnagrams da = new DecideAnagrams();
        if(da.decideAnagrams(str0, str1)) {
            System.out.println(str0+" and "+str1+" are anagrams.");
        }
        if(!da.decideAnagrams(str0, str2)) {
            System.out.println(str0+" and "+str2+" are not anagrams.");
        }
    }

    private boolean decideAnagrams(String str0, String str1) {
        if(str0==null || str1==null || str0.length()!=str1.length()) {
            return false;
        }

        int[] check = new int[128];

        for(int i = 0; i < str0.length(); i++) {
            int index = (int)str0.charAt(i);
            check[index]++;
        }
        for(int i = 0; i < str1.length(); i++) {
            int index = (int)str1.charAt(i);
            if((--check[index]) < 0) {
                return false;
            }
        }
        int count = 0;
        while(count<128 && check[count]==0) {
            count++;
        }
        if(count == 128) {
            return true;
        }else {
            return false;
        }
    }
}
