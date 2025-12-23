package io.sudymaterial.algorithm;

public class BinarySearchDemo {


    static int binarySearchIterative(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearchRecursive(int arr[], int low, int high, int x) {
        if (high >= low) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearchRecursive(arr, low, mid - 1, x);
            }

            return binarySearchRecursive(arr, mid + 1, high, x);
        }

        return -1;
    }

    public static void main(String args[]) {

        int nums[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("BinarySearchDemo :: main : " + binarySearchIterative(nums, 7));
        System.out.println("BinarySearchDemo :: main : " + binarySearchRecursive(nums, 0, nums.length - 1, 7));
    }
}
