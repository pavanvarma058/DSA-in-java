public class SearchInMountain {
    // link: https://leetcode.com/problems/find-in-mountain-array/description/
    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(findInMountainArray(target, mountainArr));
    }
    public static int findInMountainArray(int target, int[] arr) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        // try to reach in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of array
                // this maybe answer , but look left
                end = mid;
            } else {
                // you are in ascending part of array
                // because we know that mid+1 element > mid-element
                start = mid + 1;
            }
        }
        return start; // or end because both are equal
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            // find the middle element
            // int mid = (start + end) / 2; might be possible that this equation exceeds the limit
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
