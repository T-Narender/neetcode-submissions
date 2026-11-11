class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1>len2){
            return false;
        }

        int s1Cnt[] = new int[26];
        int s2Cnt[] = new int[26];
        for(int i=0;i<len1;i++){
            s1Cnt[s1.charAt(i) - 'a']++;
            s2Cnt[s2.charAt(i) - 'a']++;
        }

        for(int i=0;i<len2-len1;i++){
            if(matches(s1Cnt,s2Cnt)){
                return true;
            }
            s2Cnt[s2.charAt(i+len1) - 'a']++;
            s2Cnt[s2.charAt(i)-'a']--;
        }
        return matches(s1Cnt,s2Cnt);
                
    }

    private boolean matches(int[] s1Cnt, int[] s2Cnt){
        for(int i=0;i<26;i++){
            if(s1Cnt[i]!=s2Cnt[i]){
                return false;
            }
        }
        return true;
    }
}
