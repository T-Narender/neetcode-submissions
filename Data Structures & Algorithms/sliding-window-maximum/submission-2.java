class Solution {
    // int maxArr[] = new int[n];
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n =  nums.length;
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        int maxArr[] = new int[n-k+1];
        int i=0;
        int l = 0;

        for(int r=0;r<n;r++){
            tm.put(nums[r],tm.getOrDefault(nums[r],0)+1);

            if(r-l+1 == k){
                maxArr[i++] = tm.lastKey();

                int leftVal = nums[l++];
                if(tm.get(leftVal) == 1){
                    tm.remove(leftVal);
                }
                else{
                    tm.put(leftVal,tm.get(leftVal) - 1);
                }
            }
            
        }
        return maxArr;
    }

    
}


