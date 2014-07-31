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

        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i < row.length; i++) {
            if(row[i]) {
                matrix[i] = new int[n];
            }
        }
        for(int i = 0; i < col.length; i++) {
            if(col[i]) {
                for(int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
