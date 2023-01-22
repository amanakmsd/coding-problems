import java.util.Arrays;

class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        int[] copyNums = nums.clone();
        Arrays.sort(copyNums);
        int arrLength = copyNums.length;
        int i = 0;
        int j = arrLength-1;
        boolean found = false;
        while(i<j) {
            int sum = copyNums[i] + copyNums[j];
            if(sum < target)
                i++;
            else if(sum > target)
                j--;
            else {
                found = true;
                break;
            }
        }
        if(!found)
            return new int[]{-1,-1};
        int finalI = -1;
        int finalJ = -1;
        for(int p=0;p<arrLength;p++) {
            if(nums[p] == copyNums[i] && finalI ==-1)
                finalI = p;
            if(nums[p] == copyNums[j] && finalJ==-1 && finalI != p)
                finalJ = p;
        }
        return new int[]{finalI, finalJ};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum2().twoSum(new int[]{3,3}, 6)));
    }
}