package approaches;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        boolean[] window = new boolean[200];
        int i = 0;
        int j = 0;
        int max = 0;
        int len = s.length();
        while(i<=j && j<len) {
            int val = s.charAt(j) ;
            if (window[val]) {
                window[s.charAt(i)] = false;
                i++;
            }
            else {
                if(max <(j+1-i)) {
                    max = j+1-i;
                }
                window[s.charAt(j)] = true;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int val = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(" ");
        System.out.println(val);
    }
}
