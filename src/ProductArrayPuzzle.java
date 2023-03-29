public class ProductArrayPuzzle {
    public int[] solve(int[] A) {
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        int len = A.length;
        left[0] = 1;
        right[len-1] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i-1]*A[i-1];
        }
        for (int i = len-2; i >=0 ; i--) {
            right[i] = right[i+1]*A[i+1];
        }
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = left[i]*right[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] result = new ProductArrayPuzzle().solve(a);
        for(int res: result) {
            System.out.println(res);
        }
    }
}
