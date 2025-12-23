package Divide_and_Conquer.Merge_Sort;

public class Solution {

    // Main merge sort function
    public static void mergeSort(int arr[], int si, int ei) {

        // Base case: single element
        if (si >= ei) {
            return;
        }

        // Find mid index
        int mid = si + (ei - si) / 2;

        // Divide left half
        mergeSort(arr, si, mid);

        // Divide right half
        mergeSort(arr, mid + 1, ei);

        // Merge sorted halves
        merge(arr, si, mid, ei);
    }

    // Function to merge two sorted parts of array
    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;       // left subarray pointer
        int j = mid + 1;  // right subarray pointer
        int k = 0;        // temp array pointer

        // Compare and merge
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp array back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Print array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
