package cc1_3;

/**
 * Created by lenovo on 2014/7/30.
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        String str1 = "abcdefbg";

        RemoveDuplicate rd = new RemoveDuplicate();
        String str = rd.removeDuplicate(str1);
        System.out.println(str);
    }

    private String removeDuplicate(String str) {
        if(str == null) {
            return str;
        }
        int strLength = str.length();
        for(int i = 0; i < strLength; i++) {
            for(int j = i+1; j < strLength; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    str = str.substring(0, i) + str.substring(strLength-1) + str.substring(i+1, strLength-1);
                    strLength--;
                    i--;
                    break;
                }
            }
        }
        return str;
    }
}
