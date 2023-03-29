public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String finalStr = "";
        if(strs.length >= 2) {
            finalStr = findCommon(strs[0], strs[1]);
        }
        for(int i=2;i< strs.length;i++) {
            finalStr = findCommon(finalStr, strs[i]);
        }
        return finalStr;
    }

    public String findCommon(String s1, String s2) {
        int i = 0;
        StringBuilder finalStr = new StringBuilder();
        while(i<s1.length() && i<s2.length()) {
            if(s1.charAt(i) == s2.charAt(i)) {
                finalStr.append(s1.charAt(i));
            }
            else {
                break;
            }
            i++;
        }
        return finalStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}
