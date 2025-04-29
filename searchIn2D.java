class Solution {
    public int[] searchMatrix(int[][] a, int target) {
        int n = a.length;
        int m = a[0].length;
        int st = 0, end = n * m - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midEle = a[mid / m][mid % m];
            
            if (midEle == target) {
                return new int[]{mid / m, mid % m}; // Return row and column index
            }
            if (target < midEle) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return new int[]{-1, -1}; // Return [-1, -1] if not found
    }
}

