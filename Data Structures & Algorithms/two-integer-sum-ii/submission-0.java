class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int j = n-1;
        int i = 0;
        while(i<j){
            if(numbers[i]+numbers[j] == target){
                return new int[]{i+1,j+1};
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{};
    }
}
