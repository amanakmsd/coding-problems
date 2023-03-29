//import java.util.List;
//
//public class PalindromePartitioning {
//    public List<List<String>> partition(String s) {
//        for(int i=0;i<s.length();i++) {
//            for(int j=i+1;j<s.length();j++) {
//                String sub1 = s.substring(i, j);
//                String sub2 = s.substring(j);
//                if(isPalindrome(sub1) && isPalindrome(sub2)) {
//
//                }
//            }
//        }
//    }
//
//    public boolean isPalindrome(String s) {
//        int i = 0;
//        int j = s.length()-1;
//        while(i<j) {
//            if(s.charAt(i) != s.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
//        return true;
//    }
//}
