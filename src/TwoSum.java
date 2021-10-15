class TwoSum {
    public void twoSum(int[] nums, int target) {
        //Step1: Sort
        int[] numsCopy = new int[nums.length];
        System.arraycopy(nums, 0, numsCopy, 0, nums.length);
        mergeSort(nums, 0, nums.length-1);
        int[] values = twoSumInternal(nums, target);
        int j=-1;
        int k=-1;
        for(int p=0;p< nums.length;p++) {
            if(numsCopy[p] == values[0] && j==-1) {
                j = p;
            }
            else {
                if(numsCopy[p] == values[1] && k==-1) {
                    k = p;
                }
            }
        }
        System.out.print(j+" ");
        System.out.print(k+" ");
    }
    private void mergeSort(int[] nums, int lI, int rI) {
        if(lI == rI)
            return;
        int mI = lI + (rI-lI)/2;
        mergeSort(nums, lI, mI);
        mergeSort(nums,mI+1,rI);
        merge(nums,lI,mI,rI);
    }
    private void merge(int[] nums, int lI,int mI, int rI) {
        int i = lI;
        int j = mI+1;
        int k = 0;
        int[] aux= new int[rI-lI+1];
        while(i <= mI && j <= rI) {
            if(nums[i] <= nums[j]) {
                aux[k++] = nums[i];
                i++;
            }
            else {
                aux[k++] = nums[j];
                j++;
            }
        }
        while(i<=mI) {
            aux[k++] = nums[i];
            i++;
        }
        while(j<=rI) {
            aux[k++] = nums[j];
            j++;
        }
        i = lI;
        for(int p=0;p<k;p++){
            nums[i++]=aux[p];
        }
    }
    private int[] twoSumInternal(int[] nums, int target) {
        int lI=0;
        int rI= nums.length-1;
        while(lI < rI) {
            if(nums[lI] + nums[rI] == target) {
                return new int[]{nums[lI], nums[rI]};
            }
            else if(nums[lI] + nums[rI] < target) {
                lI++;
            }
            else {
                rI--;
            }
        }
        return new int[]{-1,-1};
    }


    public static void main(String[] args){
        int[] elem = {2,7,11,15};
        new TwoSum().twoSum(elem,9);
    }
}