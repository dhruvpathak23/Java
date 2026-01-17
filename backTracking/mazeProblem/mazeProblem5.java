package backTracking.mazeProblem;

// print all ths paths wich it can go from point A i.e (2,2) to point B i.e (0,0) in a maze.
// we can move in 4 directions- Down(D), Right(R), Up(U), Left(L)

// all cell that are visited, mark those as false so that we do not visit them again in the same path.
// while backtracking, unmark the cell (mark it true) so that it can be visited in other paths.

// when the function returns to the previous call, unmark the cell to allow other paths to use it.

// when you come out of the recurcise function?
// when you are in above recursion calls. Hence, re-mark the cell as true.
// change the changes that you made already previously.

public class mazeProblem5{
    public static void main(String[] args){
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        path("", board, 2, 2);
    }
    static void path(String p, boolean[][] board, int r, int c){
        // base case
        if(r == 0 && c == 0){
            System.out.println(p);
            return;
        }
        // if cell is false, then return
        if(!board[r][c]){
            return;
        }
        // i'm considering this cell as my path
        board[r][c] = false;
        if(r < board.length -1){
            path(p+"D", board, r+1, c);
        }
        if(c < board[0].length -1){
            path(p+"R", board, r, c+1);
        }
        if(r > 0){
            path(p+"U", board, r-1, c);
        }
        if(c > 0){
            path(p+"L", board, r, c-1);
        }
        // backtracking - unmark the cell (make it true) so that it can be visited in other paths
        // this line is where the function will be over.
        // So,before the function get removed,also remove the changes that were made by that function.
        board[r][c] = true;
    }
    

}
