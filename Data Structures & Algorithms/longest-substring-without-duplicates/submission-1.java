class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxCnt = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        char []chr = s.toCharArray();
        for(int r=0;r<chr.length;r++){
            hm.put(chr[r],hm.getOrDefault(chr[r],0)+1);

            while(hm.get(chr[r])>1){
                hm.put(chr[l],hm.get(chr[l])-1);
                if(hm.get(chr[l])==0){
                    hm.remove(chr[l]);
                }
                l++;
            }
            maxCnt = Math.max(maxCnt,r-l+1);
        }
        return maxCnt;
    }
}
