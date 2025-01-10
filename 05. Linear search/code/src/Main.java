public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 19, 18, 17, -11, -24, 99};
        int target = 180;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    static boolean linearSearch3(int[] arr, int target) {

        //run for a loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }


    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run for a loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //run for a loop
        for(int index=0; index < arr.length; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

    // Best Case : O(1) if the target is found on very first element of the given array
    // Worst Case : O(n) You do not find the target item, iterate to very last item but everytime it says i cannot find it..!
}