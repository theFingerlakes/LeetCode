class Solution {
    public int pivotIndex(int[] nums) {
        /*
        int total = 0;
        for (int i = 0; i < nums.length; ++i) {
            total += nums[i];
        }
        */
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
