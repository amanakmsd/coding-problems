import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    private final String[] mapper = new String[]{"", "","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return new ArrayList<>();
        List<String> temp = letterCombinations(digits.substring(1));
        Character num = digits.charAt(0);
        int numInt = Integer.parseInt(String.valueOf(num));
        List<String> soln = new ArrayList<>();
        return new ArrayList<>();

    }
}
