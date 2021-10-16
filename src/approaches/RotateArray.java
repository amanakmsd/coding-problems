package approaches;

//Space Complexity: O(1)
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        reverse(nums, 0,length-1);
        reverse(nums, 0 , k-1);
        reverse(nums, k,length-1);
    }
    private void reverse(int[] nums, int init, int end) {
        int i = init;
        int j = end;
        while (i<j) {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        new RotateArray().rotate(arr, k);
        for( int num : arr) {
            System.out.print(num+" ");
        }
    }
}
