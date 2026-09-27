class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            Set<Character> r= new HashSet<>();
            Set<Character> c= new HashSet<>();
            Set<Character> b=new HashSet<>();
            for(int j=0;j<9;j++){

             //row
             if(board[i][j]!='.'){
                if(r.contains(board[i][j]))
                    return false;
                else
                    r.add(board[i][j]);
             }


             //col
             if(board[j][i]!='.'){
                if(c.contains(board[j][i]))
                    return false;
                else
                    c.add(board[j][i]);
             }

             //box
                int brow=3*(i/3)+(j/3);
                int bcol=3*(i%3)+(j%3);
                if(board[brow][bcol]!='.'){
                    if(b.contains(board[brow][bcol]))
                        return false;
                    else
                    b.add(board[brow][bcol]);
                }

            }
        }
        return true;
    }
}
