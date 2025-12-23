class Solution {
    public int search(int[] nums, int target) {

        // Left and right pointers for binary search
        int left = 0;
        int right = nums.length - 1;

        // Binary search loop
        while (left <= right) {

            // Find middle index safely
            int mid = left + (right - left) / 2;

            // If target found at mid
            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {

                // Target lies in left sorted half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                }
              
                else {
                    left = mid + 1;
                }

            }
            // Right half is sorted
            else {

                // Target lies in right sorted half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }
               
                else {
                    right = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }
}
