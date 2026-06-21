/*TC = O(n log n)

Because there are log n levels of recursion and each level performs O(n) merging work.

SC = O(n)

Because a temporary array is used during merging to store elements before copying them back.*/


import java.util.Arrays;

public class Main {

static void mergeSort(int[] arr, int low, int high) {

    // Base case: if only one element or no element, already sorted
    if (low >= high) {
        return;
    }

    // Find middle index
    int mid = (low + high) / 2;

    // Sort left half
    mergeSort(arr, low, mid);

    // Sort right half
    mergeSort(arr, mid + 1, high);

    // Merge the two sorted halves
    merge(arr, low, mid, high);
}

static void merge(int[] arr, int low, int mid, int high) {

    // Temporary array to store merged sorted elements
    int[] temp = new int[high - low + 1];

    // Pointer for left sorted half
    int left = low;

    // Pointer for right sorted half
    int right = mid + 1;

    // Pointer for temp array
    int k = 0;

    // Compare elements from both halves and store smaller one in temp
    while (left <= mid && right <= high) {

        if (arr[left] <= arr[right]) {
            temp[k++] = arr[left++];
        } else {
            temp[k++] = arr[right++];
        }
    }

    // Copy remaining elements from left half
    while (left <= mid) {
        temp[k++] = arr[left++];
    }

    // Copy remaining elements from right half
    while (right <= high) {
        temp[k++] = arr[right++];
    }

    // Copy merged sorted elements back to original array
    for (int i = 0; i < temp.length; i++) {
        arr[low + i] = temp[i];
    }
}
}
}
