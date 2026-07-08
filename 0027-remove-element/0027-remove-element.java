class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the position of the next non-val element
        
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not the target value
            if (nums[i] != val) {
                // Move it to the front at index k
                nums[k] = nums[i];
                k++;
            }
        }
        
        // k is the total count of elements not equal to val
        return k;
    }
}