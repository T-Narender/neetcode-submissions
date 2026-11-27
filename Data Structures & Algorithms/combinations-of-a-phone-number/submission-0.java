class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            return result;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(result,map,digits,0,new StringBuilder());

        return result;
    }

    private void backtrack(List<String> result,HashMap<Character, String> map,
        String digits,int idx,StringBuilder curr){

        if(idx == digits.length()){
            result.add(curr.toString());
            return;
        }

        char ch = digits.charAt(idx);
        String letters = map.get(ch);

        for(int i = 0; i < letters.length(); i++){
            curr.append(letters.charAt(i));

            backtrack(result,map,digits,idx+1,curr);

            curr.deleteCharAt(curr.length()-1);
        }
    }
}
