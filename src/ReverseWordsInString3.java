public class ReverseWordsInString3 {

    public String reverseWords(String s) {
       return reverseRecursively(s);

    }

    private String reverseRecursively(String s) {
        if(!s.contains(" ")) {
            return reverse(s);
        }
        int partition = s.indexOf(" ");
        String result =  reverse(s.substring(0, partition))+" ";
        if(partition != s.length()-1) {
            result+=reverseRecursively(s.substring(partition+1));
        }
        return result;
    }

    private String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String sol = new ReverseWordsInString3().reverseWords(" ");
        System.out.println(sol);
    }
}
