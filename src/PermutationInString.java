public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int[] checker = new int[26];
        int s1Length = s1.length();
        for(int i =0;i<s1Length;i++) {
            checker[s1.charAt(i)-'a'] += 1;
        }
        int s2Length = s2.length();
        int i = 0;
        int j = 0;
        while(i<j && j<s2Length) {
            
        }
        return false;
    }
}
