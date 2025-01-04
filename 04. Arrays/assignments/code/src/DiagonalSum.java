public class DiagonalSum {
    // link: https://leetcode.com/problems/matrix-diagonal-sum/description/
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int diagonalSum = MatrixDiagonalSum(mat);
        System.out.println(diagonalSum);
    }
    public static int MatrixDiagonalSum(int[][] mat){
        int sum = 0;
        int n = mat.length;
        int len = mat.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i==j){
                    sum += mat[i][j];
                } else if (i == (len - j)) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
