package approaches;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=nums[k]) {
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }

    public static void main(String[] args) {
        int a = new RemoveDuplicatesfromSortedArray().removeDuplicates(new int[]{1,2,3,4});
        System.out.println(a);
    }
}
