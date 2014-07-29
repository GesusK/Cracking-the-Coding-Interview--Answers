package cc1_1;

/**
 * Created by lenovo on 2014/7/28.
 */
public class UniqueCharacters {

    public static void main(String[] args) {
        String input1 = "aebqcwB";
        String input2 = "aebqcwe";

        UniqueCharacters uc = new UniqueCharacters();
        if(uc.isUnique(input1)) {
            System.out.println(input1 + " has all unique characters.");
        }else {
            System.out.println(input1 + " has repeated characters.");
        }
        if(uc.isUnique(input2)) {
            System.out.println(input2 + " has all unique characters.");
        }else {
            System.out.println(input2 + " has repeated characters.");
        }
    }

    private boolean isUnique (String input) {
        boolean[] check = new boolean[256];
        for(int i = 0; i < input.length(); i ++) {
            int checkIndex = 128 + (int) input.charAt(i);
            if(check[checkIndex] == true) {
                return false;
            }else {
                check[checkIndex] = true;
            }
        }
        return true;
    }
}
