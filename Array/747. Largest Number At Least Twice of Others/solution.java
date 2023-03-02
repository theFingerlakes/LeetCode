class Solution {
    public int dominantIndex(int[] nums) {
        int largest = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                maxIndex = i;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != largest && 2 * nums[i] > largest) return -1;
        }
        
        return maxIndex;
    }
}
