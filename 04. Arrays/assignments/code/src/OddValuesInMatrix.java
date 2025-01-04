public class OddValuesInMatrix {
    // link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
    public static void main(String[] args) {
        int[][] indices = {
                {0, 1},
                {1, 1}
        };
        int m = 2;
        int n = 3;
        int countOddCells = oddCells(m, n, indices);
        System.out.println(countOddCells);
    }
    public static int oddCells(int m, int n, int[][] indices){
        int[][] matrix = new int[m][n];
        int count = 0;
        for (int i = 0; i < indices.length; i++) {
            for(int j=0; j<n; j++){
                matrix[indices[i][0]][j]++;
            }
            for(int j=0; j<m; j++){
                matrix[j][indices[i][1]]++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
