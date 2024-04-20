public class SmallestLetter {

    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'a';
//        char ans = nextGreatestLetter(arr, target);
//        System.out.println(ans);

    }

    // return the index of smalled no >= target

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            // find the middle element
            // int mid = (start + end) / 2; might be possible that this equation exceeds the limit
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
