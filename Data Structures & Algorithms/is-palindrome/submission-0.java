class Solution {
    public boolean isPalindrome(String s) {  
        int i=0;
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        int j = cleaned.length()-1;
        char[] ss = cleaned.toLowerCase().toCharArray();

        while(i<j){
            if(ss[i]!=ss[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
