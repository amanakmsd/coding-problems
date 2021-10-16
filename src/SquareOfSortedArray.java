public class SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] squaredArray = square(nums);
        if(squaredArray.length == 1) {
            return squaredArray;
        }
        int inflectionIndex = getInfletionIndex(squaredArray);
        return getSquaredSortedArray(inflectionIndex, squaredArray);
    }
    private int[] getSquaredSortedArray(int inflectionIndex, int[] squaredArray) {
        return switch (inflectionIndex) {
            case -1 -> squaredArray;
            case -2 -> reverse(squaredArray, squaredArray.length - 1);
            default -> getSortedArray(squaredArray, inflectionIndex);
        };
    }
    private int[] getSortedArray(int[] squaredArray, int inflectionIndex) {
        int[] sortedArray = new int[squaredArray.length];
        int i = inflectionIndex-1;
        int j = inflectionIndex;
        int k = 0;
        while(i>=0 && j<squaredArray.length) {
            if(squaredArray[i] < squaredArray[j]) {
                sortedArray[k++] = squaredArray[i];
                i--;
            }
            else {
                sortedArray[k++] = squaredArray[j];
                j++;
            }
        }
        while(i>=0) {
            sortedArray[k++] = squaredArray[i];
            i--;
        }
        while (j<squaredArray.length) {
            sortedArray[k++] = squaredArray[j];
            j++;
        }
        return sortedArray;
    }
    private int[] reverse(int[] squaredArray, int index) {
        int i = 0;
        int j = index;
        while(i<j) {
            int temp = squaredArray[i];
            squaredArray[i] = squaredArray[j];
            squaredArray[j] = temp;
            i++;
            j--;
        }
        return squaredArray;
    }
    private int getInfletionIndex(int[] squaredArray) {
        if(squaredArray.length ==2) {
            if(squaredArray[0] < squaredArray[1]){
                return -1;
            }
            else{
                return -2;
            }
        }
        for(int i =1;i<squaredArray.length-1;i++) {
            if(squaredArray[i-1] < squaredArray[i]) {
                return -1;
            }
            if((squaredArray[i]<=squaredArray[i-1] && squaredArray[i] <squaredArray[i+1])) {
                return i;
            }
        }
        return -2;
    }
    private int[] square(int[] nums) {
        int[] squaredArray = new int[nums.length];
        int index = 0;
        for(int num : nums) {
            squaredArray[index++] = num*num;
        }
        return squaredArray;
    }
    public static void main(String[] args) {
        int[] inp = new int[]{0,2};
        int[] out = new SquareOfSortedArray().sortedSquares(inp);
        for(int val:out) {
            System.out.print(val+" ");
        }
    }
}
