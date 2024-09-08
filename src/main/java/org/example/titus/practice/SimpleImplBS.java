package org.example.titus.practice;

public class SimpleImplBS {

    // Binary Search method to find target
    public int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        // Loop until the left index is less than or equal to the right index
        while (l <= r) {
            // Find the middle index
            int mid = (l + r) / 2;

            // Check if the middle element is the target
            if (arr[mid] == target) {
                return mid;  // Return the index of the target
            }
            // If the target is smaller, ignore the right half
            else if (arr[mid] > target) {
                r = mid - 1;
            }
            // If the target is larger, ignore the left half
            else {
                l = mid + 1;
            }
        }

        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Create an instance of the class
        SimpleImplBS obj = new SimpleImplBS();

        // Array to search in
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Target value to search for
        int target = 2;

        // Call the binarySearch method and store the result
        int result = obj.binarySearch(arr, target);

        // Print the result
        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}


