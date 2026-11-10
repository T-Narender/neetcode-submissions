class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);

        int n = nums.length;
        int count = 1;
        int maxCnt = 1;

        
        for(int r=1;r<n;r++){
            if(nums[r]==nums[r-1]){
                continue;
            }
            if(nums[r] == nums[r-1]+1){
                count++;
            }else{
                count=1;
            }
            maxCnt = Math.max(maxCnt,count);

        }
        return maxCnt;
    }
}
