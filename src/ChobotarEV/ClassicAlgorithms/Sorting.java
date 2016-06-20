package ChobotarEV.ClassicAlgorithms;
/*
Implement two types of sorting algorithms: Merge sort and bubble sort.
*/

public class Sorting {

    public Sorting(String algorithm,int[] nums) {
        if(algorithm.equals("bubble")) bubbleSort(nums);
        if(algorithm.equals("merge")) mergeSort(nums,0,nums.length);
    }

    private void bubbleSort(int[] nums) {
        System.out.println("Bublesort result:");
        for(int i=1; i<nums.length;i++)
            for(int j=nums.length-1;j>=i;j--) {
                if(nums[j-1]>nums[j]) {
                    nums[j-1] += nums[j];
                    nums[j  ] = nums[j-1]-nums[j];
                    nums[j-1] -= nums[j];
                }
            }
        for(int num : nums) {
            System.out.print(num+" ");
        }
    }
    
    private void mergeSort(int[] nums, int left, int right) {
        if (left + 1 < right) {
            int middle = (left + right) >> 1;
            
            mergeSort(nums, left, middle);
            mergeSort(nums, middle, right);
 
            int length = right - left;
            int[] tmp = new int[length];
            int i = left;
            int j = middle;
            for (int k = 0; k < length; k++) {
                if (j >= right || i < middle && nums[i] < nums[j]) {
                    tmp[k] = nums[i++];
                } else {
                    tmp[k] = nums[j++];
                }
            }
            System.arraycopy(tmp, 0, nums, left, length);
            for(int num:tmp){
                System.out.print(" "+num);
            }
            System.out.println();
            
        }
       
    }
}
