public class HighestAltitude {
    // link: https://leetcode.com/problems/find-the-highest-altitude/description/
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int highestAlt = largestAltitude(gain);
        System.out.println(highestAlt);
    }
    public static int largestAltitude(int[] gain){
        int n = gain.length;
        int highest = 0;
        int path = 0;
        for (int i = 0; i < n; i++) {
            path += gain[i];

            if(path > highest){
                highest = path;
            }
        }
        return highest;
    }
}
