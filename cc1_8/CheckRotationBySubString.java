package cc1_8;

/**
 * Created by lenovo on 2014/7/31.
 */
public class CheckRotationBySubString {

    public static void main(String[] args) {
        //Test quicksort method.
        String s1 = "bcedfahgij2";

        CheckRotationBySubString crbss = new CheckRotationBySubString();
        System.out.println(crbss.quickSort(s1));
    }

    private boolean checkRotationBySubString(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        s1 = this.quickSort(s1);
        s2 = this.quickSort(s2);
        if(this.isSubstring(s1, s2)) {
            return true;
        }else {
            return false;
        }
    }

    private String quickSort(String str) {
        if(str == null || str.length() < 2) {
            return str;
        }

        int i = 0;
        int j = str.length();
        char p = str.charAt(0);

        while(true) {
            while(str.charAt(++i) <= p) {
                if(i == str.length()-1) {
                    break;
                }
            }
            while(str.charAt(--j) > p) {
                if(j == 0) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            str = str.substring(0,i) + str.charAt(j) + str.substring(i+1, j) + str.charAt(i) + str.substring(j+1);
        }
        str = this.quickSort(str.substring(1,j+1)) + p + this.quickSort(str.substring(j+1));
        return str;
    }

    private boolean isSubstring(String str, String substr) {
        //
        return false;
    }
}
