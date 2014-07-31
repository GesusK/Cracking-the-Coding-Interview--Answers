package cc1_6;

/**
 * Created by lenovo on 2014/7/31.
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[][] m = new int[4][];
        m[0] = new int[]{1,2,3,4};
        m[1] = new int[]{5,6,7,8};
        m[2] = new int[]{9,10,11,12};
        m[3] = new int[]{13,14,15,16};

        RotateMatrix rm = new RotateMatrix();
        rm.rotateMatrix(m);

        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    private void rotateMatrix(int[][] matrix) {
        if(!this.checkNxN(matrix)) {
            return;
        }
        int n = matrix.length;
        //It's not easy to directly rotate it in place. So we choose to transpose it first, then make a symmetry.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                matrix[i][j] = matrix[i][j]^matrix[j][i];
                matrix[j][i] = matrix[i][j]^matrix[j][i];
                matrix[i][j] = matrix[i][j]^matrix[j][i];
            }
        }
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < n/2; i++) {
                matrix[i][j] = matrix[i][j]^matrix[n-i-1][j];
                matrix[n-i-1][j] = matrix[i][j]^matrix[n-i-1][j];
                matrix[i][j] = matrix[i][j]^matrix[n-i-1][j];
            }
        }
    }

    private boolean checkNxN(int[][] matrix) {
        if(matrix==null || matrix.length==0) {
            return false;
        }
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i].length != matrix.length) {
                return false;
            }
        }
        return true;
    }
}
