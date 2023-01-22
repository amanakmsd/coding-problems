import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {
    public int reverse(int x) {
        boolean isPositive  = x>=0;
        int value = isPositive? x: x*(-1);
        long reverse = 0;
        List<Integer> reverseList = new ArrayList<>();
         while(value>0) {
             int rem = value%10;
             reverseList.add(rem);
             value/=10;
         }
         for(int num: reverseList) {
             reverse*=10;
             reverse+=num;
         }
         if(reverse > 2147483647 || reverse < -2147483648) {
             return 0;
         }
         return isPositive ? (int) reverse : (int) reverse * (-1);
    }

    public static void main(String[] args) {
        int ans = new ReverseInteger().reverse(1534236469);
        System.out.println(ans);
    }

}
//2147483647
//-2147483648