public class PeakElement {
    // link: https://leetcode.com/problems/find-peak-element/description/
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }
    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}
