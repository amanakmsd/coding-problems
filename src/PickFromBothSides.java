public class PickFromBothSides {


    public int solve(int[] A, int B) {
        int length = A.length;
        B = length-B;
        int sumInit = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < B; i++) {
            sumInit+=A[i];
        }
        int ind = 0;
        int windowSum = sumInit;
        while(ind+B-1 < length) {
            if(minSum>windowSum) {
                minSum = windowSum;
            }
            ind++;
            if(ind+B-1 <length) {
                windowSum=windowSum-A[ind-1]+A[ind+B-1];
            }
        }
        int sum=0;
        for (int a: A) {
            sum+=a;
        }
        return sum-minSum;

    }


    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 5;
        a[1] = -2;
        a[2] = 3;
        a[3] = 1;
        a[4] = 2;
        System.out.println(new PickFromBothSides().solve(a, 3));

    }
}
