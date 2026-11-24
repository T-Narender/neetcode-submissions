class Solution {

    static void solve(int nums[],int target,int idx, List<List<Integer>> ans,List<Integer> output){
        if(target == 0){
            ans.add(new ArrayList(output));
            return;
        }

        if(idx >= nums.length){
            return;
        }

        if(target < 0){
            return;
        }

        output.add(nums[idx]);
        solve(nums,target-nums[idx],idx,ans,output);

        output.remove(output.size()-1);
        solve(nums,target,idx+1,ans,output);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int idx = 0;

        solve(nums,target,idx,ans,output);

        return ans;
    }
}
