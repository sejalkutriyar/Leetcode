class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int left = 0;
        int bottom = rows - 1;
        int right = cols - 1;
        int totalElements = rows * cols;

        while (top <= bottom && left <= right && result.size() < totalElements) {
            // Traverse from left to right along the top row
            for (int col = left; col <= right && result.size() < totalElements; col++) {
                result.add(matrix[top][col]);
            }
            // Traverse from top to bottom along the right column
            for (int row = top + 1; row <= bottom && result.size() < totalElements; row++) {
                result.add(matrix[row][right]);
            }
            // Traverse from right to left along the bottom row
            for (int col = right - 1; col >= left && result.size() < totalElements; col--) {
                result.add(matrix[bottom][col]);
            }
            // Traverse from bottom to top along the left column
            for (int row = bottom - 1; row > top && result.size() < totalElements; row--) {
                result.add(matrix[row][left]);
            }
            top++;
            left++;
            bottom--;
            right--;
        }

        return result;
    }
}