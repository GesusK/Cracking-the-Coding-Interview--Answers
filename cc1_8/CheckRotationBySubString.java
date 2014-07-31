package cc1_8;

/**
 * Created by lenovo on 2014/7/31.
 */
public class CheckRotationBySubString {

    public static void main(String[] args) {
        String s1 = "bcedghaf2";

        CheckRotationBySubString crbss = new CheckRotationBySubString();
        System.out.println(crbss.quickSort(s1));
    }

    private boolean checkRotationBySubString(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        return true;
    }

    private String quickSort(String str) {
        if(str == null || str.length() < 2) {
            return str;
        }

        int i = 1;
        int j = str.length()-1;
        char p = str.charAt(0);

        while(i <= j) {
            while(i < str.length() && str.charAt(i) <= p) {
                i++;
            }
            while(j > 0 && str.charAt(j) > p) {
                j--;
            }
            if(i > j) {
                break;
            }
            str = str.substring(0,i) + str.charAt(j) + str.substring(i+1, j) + str.charAt(i) + str.substring(j+1);
            i++;
            j--;
        }
        str = this.quickSort(str.substring(1,i)) + p + this.quickSort(str.substring(i));
        return str;
    }

    private boolean isSubstring(String str, String substr) {
        //
        return false;
    }
}
