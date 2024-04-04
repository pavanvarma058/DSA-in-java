import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {18, 15, 33},
                {19, 20, 25, 33},
                {77, 8, 5, 45},
                {18, 12}
        };
        int target = 33;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
