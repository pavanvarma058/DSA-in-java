import java.util.Arrays;

public class TransposeMatrix {
    // link: https://leetcode.com/problems/transpose-matrix/description/
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transposeMat = transpose(matrix);
        System.out.println(Arrays.deepToString(transposeMat));
    }
    public static int[][] transpose(int[][] matrix){
        int m = matrix.length;
        int[][] transposeMat = new int[matrix[0].length][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMat[j][i] = matrix[i][j];
            }
        }
        return  transposeMat;
    }
}
