// this is when array is unsorted tc is O(n log n) and sc is O(1)
//but if we use this for sorted or nearly sorted our tc will be O(n^2) so for that we use  randomIndex
//refer notebook to understand
class Solution {

    // Quick Sort function
    static void quickSort(int[] arr, int low, int high) {

        // Base condition: stop when subarray has 0 or 1 element
        if (low < high) {

            // Partition the array and get pivot's correct position
            int pIndex = partition(arr, low, high);

            // Recursively sort left part of pivot
            quickSort(arr, low, pIndex - 1);

            // Recursively sort right part of pivot
            quickSort(arr, pIndex + 1, high);
        }
    }

    // Function to place pivot at correct position
    static int partition(int[] arr, int low, int high) {

        // Choose first element as pivot
        int pivot = arr[low];

        // Left pointer
        int i = low;

        // Right pointer
        int j = high;

        // Continue until pointers cross
        while (i < j) {

            // Move i until an element greater than pivot is found
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            // Move j until an element smaller than or equal to pivot is found
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            // Swap misplaced elements
            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Place pivot in its correct position
        swap(arr, low, j);

        // Return partition index
        return j;
    }

    // Helper function to swap two elements
    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



//but when the array is sorted or nearly sorted using random index
class Solution {

    public int[] sortArray(int[] nums) {

        // Start Quick Sort on the entire array
        quickSort(nums, 0, nums.length - 1);

        return nums;
    }

    static void quickSort(int[] nums, int low, int high) {

        // Base condition: stop when subarray has 0 or 1 element
        if (low < high) {

            // Place pivot at correct position and get its index
            int pivotIndex = partition(nums, low, high);

            // Recursively sort left subarray
            quickSort(nums, low, pivotIndex - 1);

            // Recursively sort right subarray
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    static int partition(int[] nums, int low, int high) {

        // Choose a random pivot to avoid worst-case O(n²)
        int randomIndex = low + (int)(Math.random() * (high - low + 1));

        // Move random pivot to the beginning
        swap(nums, low, randomIndex);

        // First element acts as pivot
        int pivot = nums[low];

        // Left pointer
        int i = low;

        // Right pointer
        int j = high;

        // Continue until pointers cross
        while (i < j) {

            // Move i until element greater than pivot is found
            while (i <= high - 1 && nums[i] <= pivot) {
                i++;
            }

            // Move j until element smaller than or equal to pivot is found
            while (j >= low + 1 && nums[j] > pivot) {
                j--;
            }

            // Swap misplaced elements
            if (i < j) {
                swap(nums, i, j);
            }
        }

        // Place pivot in its correct sorted position
        swap(nums, low, j);

        // Return pivot index
        return j;
    }

    static void swap(int[] nums, int i, int j) {

        // Swap two elements
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
