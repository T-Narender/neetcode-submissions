class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

       PriorityQueue<Integer> pq = new PriorityQueue<>((p1,p2)->{
            int f1 = hm.get(p1);
            int f2 = hm.get(p2);
            if(f1!=f2){
                return Integer.compare(f1,f2);
            }
            return Integer.compare(p1,p2);
       });

       for(int key : hm.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
       }

       int limit = Math.min(k,pq.size());
       int res[] = new int[limit];

       for(int i=limit-1;i>=0;i--){
        res[i] = pq.poll();
       }
       return res;



    }
}
