public class FindMin {
    public static void main(String[] args) {
        int[] arr = {15, 18, 1, 14, 16, 17, 20, 24, 28};
        System.out.println(min(arr));
    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
