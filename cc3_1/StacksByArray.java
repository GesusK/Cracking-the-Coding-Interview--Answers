package cc3_1;

/**
 * only provide push and pop method
 * Created by lenovo on 2014/8/3.
 */
public class StacksByArray {
    private final int arrayMax = 199;
    private int[] privateArray = new int[arrayMax];
    private int aPointer = 0;
    private int bPointer = arrayMax - 1;
    private int cPointer = arrayMax/2;
    private boolean cDirectionRight = false;

    public boolean pushA(int num) {
        if(privateArray[aPointer] == 0 && aPointer <= Math.min(cPointer, arrayMax -cPointer)) {
            privateArray[aPointer++] = num;
            return true;
        }else {
            return false;
        }
    }

    public boolean pushB(int num) {
        if(privateArray[bPointer] == 0 && bPointer >= Math.max(cPointer, arrayMax - cPointer)) {
            privateArray[bPointer--] = num;
            return true;
        }else {
            return false;
        }
    }

    public boolean pushC(int num) {
        if(cDirectionRight) {
            if(privateArray[cPointer] == 0 && cPointer <= bPointer) {
                privateArray[cPointer] = num;
                cPointer = arrayMax - cPointer - 1;
                cDirectionRight = false;
                return true;
            }
        }else {
            if(privateArray[cPointer] == 0 && cPointer >= aPointer) {
                privateArray[cPointer] = num;
                cPointer = arrayMax - cPointer;
                cDirectionRight = true;
                return true;
            }
        }
        return false;
    }

    public int popA() {
        if(aPointer != 0) {
            return privateArray[--aPointer];
        }
        return 0;
    }

    public int popB() {
        if(bPointer != arrayMax) {
            return privateArray[++bPointer];
        }
        return 0;
    }

    public int popC() {
        if(cPointer != arrayMax /2) {
            if(cDirectionRight) {
                cPointer = arrayMax - cPointer;
                cDirectionRight = false;
            }else {
                cPointer = arrayMax - cPointer - 1;
                cDirectionRight = true;
            }
            return privateArray[cPointer];
        }
        return 0;
    }

}
