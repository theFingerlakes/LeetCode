class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // move along the input array starting from the end
        for (int idx = n - 1; idx >= 0; --idx) {
            // set all the 9s at the end of array to 0s
            if (digits[idx] == 9) digits[idx] = 0;
            // here the rightmost not-nine
            else {
                digits[idx]++;
                return digits;
            }
        }
        // all the digits are 9
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
