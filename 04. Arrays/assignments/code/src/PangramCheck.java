public class PangramCheck {
    // link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean checkPangram = checkIfPangram(sentence);
        System.out.println(checkPangram);
    }

    private static boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        if(n<26){
            return false;
        }
        boolean visited[] = new boolean[26];
        for (int i = 0; i < n; i++) {
            char x = sentence.charAt(i);
            if(x >= 'a' && x <= 'z'){
                visited[x-'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if(visited[i] == false){
                return false;
            }
        }
        return true;
    }
}
