class Solution {
    public int characterReplacement(String s, int k) {
        int counts[] = new int[26];
        int maxLen = 0;
        int maxFreq = 0;
        int l = 0;

        for(int r=0;r<s.length();r++){
            char rch = s.charAt(r);
            counts[rch - 'A']++;
            maxFreq = Math.max(maxFreq,counts[rch-'A']);
            while((r-l+1)-maxFreq > k){
                char lch = s.charAt(l);
                counts[lch-'A']--;
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}
