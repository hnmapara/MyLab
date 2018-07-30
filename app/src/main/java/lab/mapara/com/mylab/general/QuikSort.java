package lab.mapara.com.mylab.general;

import java.util.Arrays;

public class QuikSort {
    public static void main(String[] args) {
        quickSort();
    }

    public static void quickSort() {
        //int[] arr = {3,2,1,6,5,4,9,8,7};
        int[] arr = {4,5,7, -1,6,9,0,3,1,2,8};
        int kthSmallest = 9;
        int kthLargest = 2;
        quickSortNoRecur(arr, 0, arr.length-1, arr.length-kthLargest);
        System.out.println(Arrays.toString(arr));
        System.out.println(kthLargest + "th : " + arr[arr.length-kthLargest]);
    }

    //Recursion
    private static void quickSort(int[] nums, int start, int end, int kthSmallest) {
        if (start >= end) return;
        int pIndex = partition(nums, start, end);
        System.out.println(pIndex + " -> " +Arrays.toString(nums));
        if (pIndex == kthSmallest) return;
        if (pIndex > kthSmallest)
            quickSort(nums, start, pIndex -1, kthSmallest);
        else
            quickSort(nums, pIndex + 1, end, kthSmallest);
    }

    //Another way(itarative)
    private static void quickSortNoRecur(int[] nums, int start, int end, int kthSmallest) {
        while(start < end) {
            int pIndex = partition(nums, start, end);
            if (pIndex == kthSmallest) return;
            if (pIndex > kthSmallest) {
                end = pIndex-1;
            } else {
                start = pIndex + 1;
            }
        }
    }

    private static int partition(int[] nums, int start, int end) {
        int pvot = nums[end];
        int pIndex = start;
        for(int i=start; i<end; i++) {
            if (nums[i] <= pvot) {
                swap(nums, i, pIndex);
                pIndex++;
            }
        }
        swap(nums, pIndex, end);
        return pIndex;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
