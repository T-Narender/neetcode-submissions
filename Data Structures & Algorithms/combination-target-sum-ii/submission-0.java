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
        solve(nums,target-nums[idx],idx+1,ans,output);

        output.remove(output.size()-1);

        while(idx+1 < nums.length && nums[idx] == nums[idx+1]){
            idx++;
        }
        solve(nums,target,idx+1,ans,output);
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int idx = 0;
        Arrays.sort(candidates);

        solve(candidates,target,idx,ans,output);

        return ans;
    }
}
