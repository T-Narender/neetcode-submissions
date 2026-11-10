class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c] == '.'){
                    continue;
                }
                char ch = board[r][c];
                String row = ch + "row" + r;
                String col = ch + "col" + c;
                String box = ch + "box" + (r/3) + "_" + (c/3);

                if(set.contains(row) ||
                    set.contains(col) ||
                    set.contains(box)){
                        return false;
                }
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        return true;
    }
}
