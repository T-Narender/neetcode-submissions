class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] pairs = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        
        int i = 0;
        int j = n - 1;
        
        while (i < j) {
            int currentSum = pairs[i][0] + pairs[j][0];
            
            if (currentSum == target) {
                int idx1 = pairs[i][1];
                int idx2 = pairs[j][1];
                return new int[]{Math.min(idx1, idx2), Math.max(idx1, idx2)};
            } else if (currentSum < target) {
                i++;
            } else {
                j--;
            }
        }
        
        return new int[]{-1, -1};
    }
}
