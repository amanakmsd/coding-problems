package approaches;

import java.util.ArrayList;

public class SpecialIndex {

    public int solve(ArrayList<Integer> A) {
        int  startEven = 0;
        int startOdd = 0;
        int endEven = 0;
        int endOdd = 0;
        boolean isOdd = true;
        for(Integer a : A) {
            if(isOdd) {
                startOdd+=a;
                isOdd=false;
            } else {
                startEven+=a;
                isOdd=true;
            }
        }
        int size = A.size();
        isOdd = true;
        for(int i=size-1;i>=0;i--) {
            if(isOdd) {
                endOdd+=A.get(i);
                isOdd = false;
            } else {
                endEven+=A.get(i);
                isOdd = true;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
