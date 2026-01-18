package backTracking;
// place n knights on n*n chessboard such that no knight can attack each other.
// backtrack,till you find atleast one way to diplay n knights on n*n chessboard.
// we will start from the (0,0) cell.
// and, run all the recursion calls to get all the possible answer.
// [r-2,c-1],[r-2,c+1],[r-1,c-2],[r-1,c+2] these are the 4 possible positions from where a knight can attack the current position.
// when a choice can affect future choices, use backtracking.
public class nKnights {
    public static void main (String[] args){
        int n = 4;
        boolean[][] board = new boolean [n] [n];
        knight(board,0,0,n);
    }
    static void knight (boolean [][]board, int row, int col, int knights){
        //base case
        if(knights == 0){
            display(board);
            System.out.println();
            return;
        } if(row == board.length-1 && col == board.length){
            return;
        } if(col == board.length){
            knight(board,row+1,0,knights);
            return;
        } 
        //place the knight if it is safe.
        if(isSafe(board,row,col)){
            board[row][col] = true;
            knight(board,row,col+1,knights-1);
            //backtracking
            board[row][col] = false;
        }
        knight(board,row,col+1,knights);
    }
    //to check whether it is safe to place the knight at that position or not.
    private static boolean isSafe(boolean[][] board, int row, int col){
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
         if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
         if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
         if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        return true;
    }
    //do not repeat yourself, helper function to check valid position.
    static boolean isValid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }
    // to display the board
    private static void display(boolean[][]board){
        for(boolean[]row : board){
            for(boolean element : row){
                if(element){
                    System.out.println("K");
                } else {
                    System.out.println("X");
                }
            }
            System.out.println();
        }
    }
}
