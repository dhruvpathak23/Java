package backTracking;
// place n queens on n*n chessboard such that no knight can attack each other.
//backtrack,till you find atleast one way to diplay n queens on n*n chessboard.
//we will start from the (0,0) cell.
// and, run all the recursion calls to get all the possible answer.
// Recurrance Relation = T(N) = N*T(N-1)+ O(N^2) => O(N^3+N!) = O(N!), Akka Bagging formula.
//O(N^2) for isSafe function, N*T(N-1) for n calls of T(N-1).
public class nQueens{
    public static void main (String[]args){
        int n = 4;
        boolean [] [] board = new boolean[n][n];
        //for printing the total no. of ways to place n queens on n*n chessboard.
       // System.out.println(queens(board,0));
       //for printing all the ways to place n queens on n*n chessboard.
         queens(board,0);
    }
    static int queens(boolean[][] board,int row){
        //base case
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        //placing the queen and checking for every column in that row.
        for(int col = 0; col < board.length; col++){
            //place the queen if it is safe.
            if(isSafe(board,row,col)){
                board [row] [col] = true;
                count += queens(board,row+1);
                //backtracking
                board [row] [col] = false;
            }
        }
        return count;    
    }

    //to check whether it is safe to place the queen at that position or not.
    private static boolean isSafe(boolean[][] board, int row, int col){

        //check vertical row
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }
        //diagonal left
        int maxLeft = Math.min(row,col);
        for(int i = 0; i <= maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for(int i = 1; i <=maxRight; i++){
            if(board[row-i][col+1]){
                return false;
            }
        }
        return true;
    }
    // to display the board
    private static void display(boolean[][]board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.println("Q");
                } else {
                    System.out.println("X");
                }
            }
            System.out.println();
        }
    }
    
}
