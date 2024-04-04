public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {15, 18, -1, 14, 16, 17, 20, -24, -28};
        int target = -1;
        System.out.println(linearSearch(arr, target, 1,5));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        //run for a loop
        for(int index=start; index <= end; index++){
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
}
