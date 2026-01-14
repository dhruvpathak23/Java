package Recursion.pattern_Question;

public class starPattern {
    public static void main (String[]args){
        pattern(4,0);
    }
    static void pattern(int col,int row){
        if(col == 0  ){
            return;
        }
        if(row < col){
            System.out.print("*");
            pattern(col,row+1);
        }
        else {
            System.out.println( );
            pattern(col-1,0);
        }
    } 
}    

