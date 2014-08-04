package cc3_2;

/**
 * Created by lenovo on 2014/8/4.
 */
public class StackWithMin {
    private final int arrayMax = 199; // must be odd
    private int[] privateArray = new int[arrayMax+1];
    private int topIndex = 0;
    private int currentMinIndex = 0;

    public boolean push(int num) {
        if(topIndex < arrayMax) {
            if(num < privateArray[currentMinIndex]) {
                privateArray[topIndex++] = num;
                privateArray[topIndex++] = currentMinIndex;
                currentMinIndex = topIndex - 2;
            }else {
                privateArray[topIndex++] = num;
                privateArray[topIndex++] = -1;
            }
            return true;
        }
        return false;
    }

    public int pop() {
        if(topIndex != 0) {
            if(currentMinIndex != topIndex-2) {
                topIndex -= 2;
                return privateArray[topIndex];
            }else {
                topIndex -= 2;
                currentMinIndex = privateArray[topIndex+1];
                return  privateArray[topIndex];
            }
        }
        return -1;
    }

    public int min() {
        if(topIndex != 0) {
            return privateArray[currentMinIndex];
        }
        return -1;
    }
}
