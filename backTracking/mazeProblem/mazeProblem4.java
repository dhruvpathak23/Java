package mazeProblem;
//print the actual apth by which we can go from point A to point B(0,0) -> (2,2) in a maze with obstacles.
// this is not backTracking as we are not unmarking the cells after visiting them.
public class mazeProblem4 {
    public static void main(String[]args){
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        obstacle("",board, 0, 0);
    }
    static void obstacle(String p, boolean [][] board, int r, int c){
        //base case
        if(r == board.length -1 && c == board[0].length - 1){
            System.out.println(p);
            return;
        }
        //if cell is false, then return
        if (!board[r][c]){
            return;
        }
        if(r < board.length-1){
            obstacle(p+"D", board, r+1, c);
        }
        if(c < board[0].length - 1){
            obstacle(p+"R", board, r, c+1);
        }
    }

}