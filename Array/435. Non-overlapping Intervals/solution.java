class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, (a, b)-> a[1]-b[1]); // lambda
        
        int k = 0, count = 1, n = intervals.length;
        for (int i = 1; i < n; i++) {
            if (intervals[k][1] <= intervals[i][0]) {
                k = i;
                count++;
            }
        }
        return n - count;
    }
}
