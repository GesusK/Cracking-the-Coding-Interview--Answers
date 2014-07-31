package cc1_7;

import java.util.ArrayList;

/**
 * Created by lenovo on 2014/7/31.
 */
public class SetZero {

    public static void main(String[] args) {
        int[][] m = new int[4][];
        m[0] = new int[]{0,2,0,4};
        m[1] = new int[]{5,6,7,8};
        m[2] = new int[]{9,10,0,12};
        m[3] = new int[]{13,14,15,16};

        SetZero sz = new SetZero();
        sz.setZero(m);

        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    private void setZero(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        ArrayList<int[]> zeroPoints = new ArrayList<int[]>();
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    int[] temp = new int[]{i,j};
                    zeroPoints.add(temp);
                }
            }
        }

        for(int index = 0; index < zeroPoints.size(); index++) {
            int i = zeroPoints.get(index)[0];
            int j = zeroPoints.get(index)[1];
            for(int x = 0; x < n; x++) {
                matrix[i][x] = 0;
            }
            for(int y = 0; y < m; y++) {
                matrix[y][j] = 0;
            }
        }
    }
}
