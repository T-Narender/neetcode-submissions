class Solution {
    private String generate(String str){
        int count[] = new int[26];

        for(char ch : str.toCharArray()){
            count[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<26;i++){
            if(count[i]>0){
                sb.append(String.valueOf((char)(i + 'a')).repeat(count[i]));
            }
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            String newStr = generate(str);
            if(!map.containsKey(newStr)){
                map.put(newStr,new ArrayList<>());
            }
            map.get(newStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
