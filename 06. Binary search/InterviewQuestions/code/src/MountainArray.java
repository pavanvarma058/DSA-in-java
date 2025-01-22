public class MountainArray {
    // link:https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // you are in decreasing part of array
                // this maybe answer , but look left
                end = mid;
            }else {
                // you are in ascending part of array
                // because we know that mid+1 element > mid-element
                start = mid + 1;
            }
        }
        // in the end, start == end and pointing to the largest number because of 2 checks
        // start and end are always trying to find max element in the above 2checks
        // hence they are pointing to just one element, that is the max one because that is what check says
        // more elaboration: at every point of time for start and end they have the best possible answer till that time
        // and if we are saying that only item is remaining, hence cuz of above line that is the best possible answer
        return start; // or end because both are equal
    }
}
