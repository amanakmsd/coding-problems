import java.math.BigInteger;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        return searchBad(1,n);

    }
//    private int searchBad(int start, int stop){
//        if(start >= stop) {
//            return stop;
//        }
//        int mid = (start+stop)/2;
//        return isBadVersion(mid) ? searchBad(start, mid-1): searchBad(mid+1, stop);
//    }

    private int searchBad(int start, int stop) {

        while(start<stop) {
            int mid = start + (stop-start)/2;
            System.out.println("mid: "+mid);
            if(isBadVersion(mid)){
                stop =  (mid-1);
            }
            else{
                start = (mid+1);
            }
        }
        return isBadVersion(stop)? stop :start;
    }

    private boolean isBadVersion(int i) {
        return i >= 1702766719;
    }
    public static void main(String[] args) {
        int value = new FirstBadVersion().firstBadVersion(2126753390);
        System.out.println(value);
    }

}

