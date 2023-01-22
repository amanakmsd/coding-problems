public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int len = s.length();
        int startIndex = 0;
        int finalIndex = len-1;

        while(startIndex <= finalIndex) {
            if(!Character.isLetterOrDigit(s.charAt(startIndex)))
                startIndex++;
            else if(!Character.isLetterOrDigit(s.charAt(finalIndex)))
                finalIndex--;
            else if(Character.toLowerCase(s.charAt(startIndex)) != Character.toLowerCase(s.charAt(finalIndex))) {
                return false;
            }
            else {
                startIndex++;
                finalIndex--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean resp = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(resp);
    }
}