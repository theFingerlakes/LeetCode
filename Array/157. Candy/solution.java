class Solution {
    public int candy(int[] ratings) {
        int size = ratings.length;
        int[] res = new int [size];
        if (size < 2) return size;
        for (int i = 0; i < size; i++) {
            res[i] = 1;
        }
        for (int i = 1; i < size; i++) {
            if (ratings[i] > ratings[i-1]) res[i] = res[i-1] + 1;
        }
        for (int i = size - 1; i > 0; i--) {
            if (ratings[i] < ratings[i-1]) res[i-1] = Math.max(res[i-1], res[i] + 1);
        }
        int result = Arrays.stream(res).sum();
        return result;
    }
}
