// to write a program to solve a sudoku puzzle using backtracking
// every digit in a 9x9 grid must be from 1 to 9 and,
// do not repeat in any row, column or 3x3 subgrid.
import java.util.*;
public class sudokoSolver {
    public static void main (String[] args){
        int [][] board = new int[][]{
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        if(solve(board)){
            display(board);
            System.out.println("Sudoku solved successfully!");
        } else {
            System.out.println("Unsolvable sudoku!");
        }
    }
    //function to solve the sudoku puzzle
    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        
        //find an empty cell
        boolean emptyLeft = true;

        //traverse the board to find an empty cell
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found some empty element in the row, then break
            if(!emptyLeft){
                break;
            }
        } 
        if(emptyLeft ){
            return true; // sudoko is solved
        }   
        //try digits from 1 to 9
        // backTrack
        for(int digit = 1; digit <= 9; digit++){
            if (isSafe(board, row, col, digit)){
                board[row][col] = digit;
                if(solve(board)){
                    //found the answer
                    
                    return true;
                } else {
                    //backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    // to display the board
    private static void display(int[][] board){
        for(int[] row : board){
             for(int digit : row){
                System.out.print (digit + " ");
            } 
            System.out.println();   
        }
    }
    static boolean isSafe(int[][] board, int row, int col, int digit){
        //chech the row
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == digit){
                return false;
            }
        }
        //chech the column
        for(int[] digits : board){
            if(digits [col ] == digit){
                return false;
            }
        }
        //check the 3x3 subgrid
        int sqrt = (int)(Math.sqrt(board.length));
        //find the starting row and column index of the subgrid
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        //traverse the 3x3 subgrid
        for(int r = rowStart; r < rowStart + sqrt; r++){
            for(int c = colStart; c < colStart + sqrt; c++){
                if(board[r][c] == digit){
                    return false;
                }
            }
        }
        return true;
    }

}
