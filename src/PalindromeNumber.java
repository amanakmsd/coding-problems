import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        List<Integer> list = convertToArray(x);
        int i = 0;

        int j = list.size()-1;
        while(i<j) {
            if(!Objects.equals(list.get(i), list.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    private List<Integer> convertToArray(int x) {
        int temp = x;
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(temp!=0) {
            list.add(temp%10);
            temp/=10;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(12321));
    }
}
