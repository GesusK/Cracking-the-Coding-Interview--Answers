package cc1_5;

/**
 * Created by lenovo on 2014/7/31.
 */
public class ReplaceSpaces {

    public static void main(String[] args) {
        String str0 = "123 432 321";
        String str1 = " qwe rty ewq ";

        ReplaceSpaces rs = new ReplaceSpaces();
        System.out.println(rs.replaceSpaces(str0));
        System.out.println(rs.replaceSpaces(str1));
    }

    private String replaceSpaces(String str) {
        if(str == null) {
            return null;
        }
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                str = str.substring(0, i) + "%20" + ((i+1) < (str.length())?str.substring(i+1, str.length()):"");
                i += 2;
            }
        }
        return str;
    }
}
