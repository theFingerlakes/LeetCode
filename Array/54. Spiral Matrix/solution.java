class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> answer = new ArrayList<Integer>();
        
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while(true) { // top <= bottom and left <= right
            // go right
            for (int i = left; i <= right; i++) {
                answer.add(matrix[top][i]);
            }
            top++;
            if (top > bottom) break;
            
            // go down
            for (int i = top; i <= bottom; i++) {
                answer.add(matrix[i][right]);
            }
            right--;
            if (right < left) break;
            
            // go left
            for (int i = right; i >= left; i--) {
                answer.add(matrix[bottom][i]);
            }
            bottom--;
            if (top > bottom) break;
            
            // go up
            for (int i = bottom; i >= top; i--) {
                answer.add(matrix[i][left]);
            }
            left++;
            if (right < left) break;
        }
        return answer;
    }
}
